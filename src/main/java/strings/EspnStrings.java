package strings;

/**
 * ESPN Strings - Class that contains the elements locators strings on ESPN Page
 * @author luis.pineda@globant.com
 */
public class EspnStrings {
    private String username, password, element1,element2,element3,element4,element5,element6,element7,element8,element9,element10, element11, element12;
    private String element13, element14,element15,element16,element17;

    /**
     * Constructor.
     */
    public EspnStrings(){
        super();
        this.username = "testfinal88@yopmail.com";
        this.password = "Thanksfortheknowledge88";
        this.element1 = "//a[@id='global-user-trigger']";
        this.element2 = "//li[@class='user hover']//div[@class='global-user']//div[@class='global-user-container']//ul[@class='account-management']//li//a[@data-affiliatename='espn'][normalize-space()='Log In']";
        this.element3 = "#disneyid-iframe";
        this.element4 = "//input[@placeholder='Username or Email Address']";
        this.element5 = "//input[@placeholder='Password (case sensitive)']";
        this.element6 = "//button[@aria-label='Log In']";
        this.element7 = "//li[@class='user hover']//li[@class='display-user']";
        this.element8 = "//li[@class='user hover']//div[@class='global-user']//div[@class='global-user-container']//ul[@class='account-management']//li//a[@class='small'][normalize-space()='Log Out']";
        this.element9 = "//article[@id='sideLogin-right-rail']//button[@class='button med'][normalize-space()='Sign Up']";
        this.element10 = "//li[@class='user hover']//div[@class='global-user']//div[@class='global-user-container']//ul[@class='account-management']//li//a[contains(text(),'ESPN Profile')]";
        this.element11 = "//a[@id='cancel-account']";
        this.element12 = "//button[@type='submit']";

        // Section for Final Exam Web Module elements
        this.element13="//article[@id='sideLogin-right-rail']//button[@class='button-alt med'][normalize-space()='Log In']";
        this.element14="//iframe[@id='oneid-iframe']";
        this.element15="//div[@data-testid='login-logo'][contains(.,'Disney account')]";
        this.element16="//button[@type='submit'][contains(.,'Log In')]";
        this.element17="//button[@type='submit'][contains(.,'Sign Up')]";
    }

    /**
     * getUsername
     * Get the username for the test.
     * @return String
     */
    public String getUsername() {
        return username;
    }

    /**
     * getPassword
     * Get the password for the test.
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * getElement1
     * Get the element1 for the test on ESPN Page.
     * @return String
     */
    public String getElement1() {
        return element1;
    }

    /**
     * getElement2
     * Get the element2 for the test on ESPN Page.
     * @return String
     */
    public String getElement2() {
        return element2;
    }

    /**
     * getElement3
     * Get the element3 for the test on ESPN Page.
     * @return String
     */
    public String getElement3() {
        return element3;
    }

    /**
     * getElement4
     * Get the element4 for the test on ESPN Page.
     * @return String
     */
    public String getElement4() {
        return element4;
    }

    /**
     * getElement5
     * Get the element5 for the test on ESPN Page.
     * @return String
     */
    public String getElement5() {
        return element5;
    }

    /**
     * getElement6
     * Get the element6 for the test on ESPN Page.
     * @return String
     */
    public String getElement6() {
        return element6;
    }

    /**
     * element7
     * Get the element7 for the test on ESPN Page.
     * @return String
     */
    public String getElement7() {
        return element7;
    }

    /**
     * getElement8
     * Get the element8 for the test on ESPN Page.
     * @return String
     */
    public String getElement8() {
        return element8;
    }

    /**
     * getElement9
     * Get the element9 for the test on ESPN Page.
     * @return String
     */
    public String getElement9() {
        return element9;
    }

    /**
     * getElement10
     * Get the element10 for the test on ESPN Page.
     * @return String
     */
    public String getElement10() {
        return element10;
    }

    /**
     * getElement11
     * Get the element11 for the test on ESPN Page.
     * @return String
     */
    public String getElement11() {
        return element11;
    }

    /**
     * getElement12
     * Get the element12 for the test on ESPN Page.
     * @return String
     */
    public String getElement12() {
        return element12;
    }

    /**
     * getElement13
     * Get the element13 for the test on ESPN Page.
     * @return String
     */
    public String getElement13() {
        return element13;
    }

    /**
     * getElement14
     * Get the element14 for the test on ESPN Page.
     * @return String
     */
    public String getElement14() {
        return element14;
    }


    /**
     * getElement15
     * Get the element15 for the test on ESPN Page.
     * @return String
     */
    public String getElement15() {
        return element15;
    }

    /**
     * getElement16
     * Get the element16 for the test on ESPN Page.
     * @return String
     */
    public String getElement16() {
        return element16;
    }

    /**
     * getElement17
     * Get the element17 for the test on ESPN Page.
     * @return String
     */
    public String getElement17() {
        return element17;
    }
}
