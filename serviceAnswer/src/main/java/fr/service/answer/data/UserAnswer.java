package fr.service.answer.data;

/**
 * @author yannk
 *
 */
public class UserAnswer {

    /** id of userAnswer. */
    private long id;

    /** User. */
    private User user;

    /** Answer. */
    private Answer answer;

    /** Points taken by User. */
    private Integer points;

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
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param theUser the user to set
     */
    public void setUser(final User theUser) {
        this.user = theUser;
    }

    /**
     * @return the points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * @param thePoints the points to set
     */
    public void setPoints(final Integer thePoints) {
        this.points = thePoints;
    }

    /**
     * @return the answer
     */
    public Answer getAnswer() {
        return answer;
    }

    /**
     * @param theAnswer the answer to set
     */
    public void setAnswer(final Answer theAnswer) {
        this.answer = theAnswer;
    }

}
