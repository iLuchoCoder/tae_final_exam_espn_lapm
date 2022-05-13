package strings;

public class EspnStrings {
    private String username, password, element1,element2,element3,element4,element5,element6,element7,element8,element9,element10, element11, element12;

    public EspnStrings(){
        super();

        //this.username = "luis.pineda@globant.com";
        //this.password = "Veritas888";
        this.username = "testespn88@yopmail.com";
        this.password = "Veridisquo8";
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
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getElement1() {
        return element1;
    }

    public String getElement2() {
        return element2;
    }

    public String getElement3() {
        return element3;
    }

    public String getElement4() {
        return element4;
    }

    public String getElement5() {
        return element5;
    }

    public String getElement6() {
        return element6;
    }

    public String getElement7() {
        return element7;
    }

    public String getElement8() {
        return element8;
    }

    public String getElement9() {
        return element9;
    }

    public String getElement10() {
        return element10;
    }

    public String getElement11() {
        return element11;
    }

    public String getElement12() {
        return element12;
    }
}
