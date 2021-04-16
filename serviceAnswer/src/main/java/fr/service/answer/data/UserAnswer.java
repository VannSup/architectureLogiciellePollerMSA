package fr.service.answer.data;

/**
 * @author yannk
 *
 */
public class UserAnswer {

    /** id of userAnswer. */
    private long id;

    /** User. */
    private long userId;

    /** Answer. */
    private long answerId;

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
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param theUserId the userId to set
     */
    public void setUserId(final long theUserId) {
        this.userId = theUserId;
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
     * @return the answerId
     */
    public long getAnswerId() {
        return answerId;
    }

    /**
     * @param theAnswerId the answerId to set
     */
    public void setAnswerId(final long theAnswerId) {
        this.answerId = theAnswerId;
    }

}
