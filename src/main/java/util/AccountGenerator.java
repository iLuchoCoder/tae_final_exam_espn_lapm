package util;

import com.github.javafaker.Faker;

/**
 * AccountGenerator, class that fills with Java Faker repository random data for testing
 * @author luis.pineda@globant.com
 */
public class AccountGenerator {
    /**
     * Attributes
     */
    private Account account = new Account();
    private static final Faker faker = new Faker();

    /**
     * Constructor
     */
    public AccountGenerator() {
        super();
        this.account.setFirst_name(faker.name().firstName());
        this.account.setLast_name(faker.name().lastName());
        this.account.setEmail(faker.internet().emailAddress());
        this.account.setPassword(faker.internet().password()+"TAE888#@");
    }

    /**
     * getFirstName
     * Method that returns the first_name attribute
     * @return String
     */
    public String getFirstName(){
        return account.getFirst_name();
    }

    /**
     * getLastName
     * Method that returns the last_name attribute
     * @return String
     */
    public String getLastName(){
        return account.getLast_name();
    }

    /**
     * getEmail
     * Method that returns the email attribute
     * @return String
     */
    public String getEmail(){
        return account.getEmail();
    }

    /**
     * getPassword
     * Method that returns the password attribute
     * @return String
     */
    public String getPassword(){
        return account.getPassword();
    }
}
