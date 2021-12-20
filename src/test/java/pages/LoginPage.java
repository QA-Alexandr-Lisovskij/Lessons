package pages;

import baseEntities.BasePage;
import common.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private final By PAGE_OPENED_IDENTIFIER = By.className("logo-loginpage");
    private final By emailfield = By.id("name");
    private final By passwordfield = By.id("password");
    private final By keeploggedin = By.className("loginpage-checkmark");
    private final By loginbtn = By.id("button_primary");
    private final By forgotpassword = By.className("'loginpage-forgotpassword");

    public LoginPage(WebDriver driver){
        super(driver);
    }



    public WebElement getEmailfield() {
        return driver.findElement(emailfield);
    }

    public WebElement getPasswordfield() {
        return driver.findElement(passwordfield);
    }

    public WebElement getLoginbtn() {
        return driver.findElement(loginbtn);
    }

    public WebElement keeploggedin() {
        return driver.findElement(keeploggedin);
    }

    public WebElement getForgotpassword() {
        return driver.findElement(forgotpassword);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }

    public void login(String username, String paswword) {
        getEmailfield().sendKeys(ReadProperties.getUsername());
        getPasswordfield().sendKeys(ReadProperties.getPassword());
        getLoginbtn().click();
    }
}
