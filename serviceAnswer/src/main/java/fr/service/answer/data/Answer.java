package fr.service.answer.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Answer is question with correct answer.
 * @author yannk
 *
 */
@Entity
public class Answer {

    /** Id use for BDD object. */
    @GeneratedValue(generator = "seq_gen_answer")
    @GenericGenerator(name = "seq_gen_answer", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = { @Parameter(name = "sequence_name", value = "seq_answer"),
                    @Parameter(name = "initial_value", value = "0"), @Parameter(name = "increment_size", value = "1") })
    @Id
    private long id;

    /** Question.  */
    @OneToOne
    private long questionId;

    /** correct answer. */
    private boolean correctAnswer;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param theId the id to set
     */
    public void setId(final long theId) {
        this.id = theId;
    }

    /**
     * @return the questionId
     */
    public long getQuestionId() {
        return questionId;
    }

    /**
     * @param theQuestionId the questionId to set
     */
    public void setQuestion(final long theQuestionId) {
        this.questionId = theQuestionId;
    }

    /**
     * @return the correctAnswer
     */
    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * @param theCorrectAnswer the correctAnswer to set
     */
    public void setCorrectAnswer(final boolean theCorrectAnswer) {
        this.correctAnswer = theCorrectAnswer;
    }

}
