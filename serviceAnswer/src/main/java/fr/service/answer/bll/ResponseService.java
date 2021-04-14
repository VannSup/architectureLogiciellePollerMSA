package fr.service.answer.bll;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import fr.service.answer.data.Answer;
import fr.service.answer.data.User;
import fr.service.answer.data.UserAnswer;
import fr.service.answer.networking.HttpClientManager;
import fr.service.answer.networking.data.ResponseBody;

/**
 * @author yannk
 *
 */
@Service
public class ResponseService {

    /** Les point max a attribué si juste + pas deja rep + question lui est envoyer.*/
    private static final int POINT_FOR_CORRECT_ANSWER = 10;

    /** Les point a attribué si l'utilisateur répond faux. */
    private static final int POINT_FOR_BAD_ANSWER = 0;

    /**
     * @author yannk
     *
     */
    @Autowired
    private HttpClientManager httpClientManager;

    @PostConstruct
    public void init() {

    }

    public final String answer(final ResponseBody responseBody) {
        String response;

        Optional<UserAnswer> askedAnswer = httpClientManager.getUserAnswerById(responseBody.getUserAnswerId());

        Assert.isTrue(askedAnswer.isPresent(), "Réponse ignorée : la question ne vous à pas été posée !");
        Assert.isTrue(askedAnswer.get().getPoints() == null,
                "Réponse ignorée : vous avez déja répondu à cette question.");

        Answer reponse = askedAnswer.get().getAnswer();

        if (responseBody.getAnswer() == reponse.getCorrectAnswer()) {
            int pointWin = getNumberOfPointTaken(askedAnswer.get().getAnswer().getQuestion(),
                    askedAnswer.get().getUser(), 0);
            askedAnswer.get().setPoints(pointWin);

            response = String.format("Bravo ! vous avez trouvé ! \n    Point obtenu : %d.", pointWin);
        } else {
            askedAnswer.get().setPoints(POINT_FOR_BAD_ANSWER);

            response = "Oops ! Ca n'est pas correcte";
        }

        return response;
    }

    /**
     * Calcul le nombre de point que l'utilisateur obtiendra.
     * @param question
     * @param user
     * @param greaterThan
     * @return result
     */
    private int getNumberOfPointTaken(final Question question, final User user, final int greaterThan) {
        int result = POINT_FOR_CORRECT_ANSWER;
        Optional<UserAnswer> previousUserAnswer = userAnswerRepository
                .findTopByAnswerQuestionAndUserAndPointsNotNullAndPointsIsGreaterThanOrderByPoints(question, user,
                        greaterThan);

        if (previousUserAnswer.isPresent()) {
            int lastEarnedPoints = previousUserAnswer.get().getPoints();
            result = lastEarnedPoints / 2;
        }

        return result;
    }
}
