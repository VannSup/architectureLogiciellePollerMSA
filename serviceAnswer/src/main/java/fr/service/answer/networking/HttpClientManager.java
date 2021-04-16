package fr.service.answer.networking;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import fr.service.answer.data.UserAnswer;

/**
 * @author yannk
 *
 */
@Service
public class HttpClientManager {

    /** fake id. */
    private final long fakeId = 0;

    /**
     * @author yannk
     */
    @PostConstruct
    public void init() {

    }

    /**
     * @param userAnswerId
     * @return fakeUA
     */
    public Optional<UserAnswer> getUserAnswerById(final long userAnswerId) {
        //Faire des appel Http pour récuperer toutes les info.

        UserAnswer fakeUA = new UserAnswer();
        fakeUA.setId(userAnswerId);
        fakeUA.setAnswerId(fakeId);
        // get Answer by id (http Request).
        fakeUA.setUserId(fakeId);
        // get User by id (http Request).
        return Optional.of(fakeUA);
    }

    /**
     * @param questionId
     * @param userId
     * @param greaterThan
     * @return fakeUA
     */
    public Optional<UserAnswer> findTopByAnswerQuestionAndUserAndPointsNotNullAndPointsIsGreaterThanOrderByPoints(
            final long questionId, final long userId, final int greaterThan) {
        // Faire appel Http au serviceUser pour récupérer.
        UserAnswer fakeUA = new UserAnswer();
        fakeUA.setId(fakeId);
        fakeUA.setAnswerId(fakeId);
        // get Answer by id (http Request).
        fakeUA.setUserId(fakeId);
        // get User by id (http Request).
        return Optional.of(fakeUA);
    }

}
