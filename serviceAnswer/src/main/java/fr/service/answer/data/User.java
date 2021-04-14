package fr.service.answer.data;

/**
 * @author yannk
 *
 */
public class User {

    /** id of user. */
    private long id;

    /** login of user. */
    private String login;

    /** lastName of user. */
    private String lastName;

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
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param theLogin the login to set
     */
    public void setLogin(final String theLogin) {
        this.login = theLogin;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param theLastName the lastName to set
     */
    public void setLastName(final String theLastName) {
        this.lastName = theLastName;
    }

}
