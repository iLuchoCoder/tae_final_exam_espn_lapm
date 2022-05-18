package util;

/**
 * Account class, class that represents the account object to be fill in the ESPN Page
 * @author luis.pineda@globant.com
 */
public class Account {

    /**
     * Attributes
     */
    private String first_name;
    private String last_name;
    private String email;
    private String password;

    /**
     * Constructor
     */
    public Account() {
        super();
    }

    /**
     * Constructor with data
     */
    public Account(String first_name, String last_name, String email, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }

    /**
     * getFirst_name
     * Method that returns first_name attribute
     * @return String
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * setFirst_name
     * Method that set the first_name attribute
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * getLast_name
     * Method that returns last_name attribute
     * @return String
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * setLast_name
     * Method that set the last_name attribute
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * getEmail
     * Method that returns email attribute
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * setEmail
     * Method that set the email attribute
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getPassword
     * Method that returns password attribute
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * setPassword
     * Method that set the password attribute
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
