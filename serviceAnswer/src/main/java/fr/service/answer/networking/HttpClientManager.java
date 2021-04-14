package fr.service.answer.networking;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import fr.service.answer.data.Answer;
import fr.service.answer.data.User;
import fr.service.answer.data.UserAnswer;

/**
 * @author yannk
 *
 */
@Service
public class HttpClientManager {

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
        fakeUA.setAnswer(new Answer());
        // get Answer by id (http Request).
        fakeUA.setUser(new User());
        // get User by id (http Request).
        return Optional.of(fakeUA);
    }

}
