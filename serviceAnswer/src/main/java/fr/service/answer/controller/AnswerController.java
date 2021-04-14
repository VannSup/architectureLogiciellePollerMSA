package fr.service.answer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.service.answer.dal.AnswerRepository;
import fr.service.answer.data.Answer;

@RestController
public class AnswerController {

    /** Access to user answer Data. */
    @Autowired
    private AnswerRepository answerRepository;

    /**
     * @param answerId
     * @return answer
     */
    public final Answer getAnswerById(final long answerId) {
        Answer answer = answerRepository.findById(answerId).get();
        return answer;
    }
}
