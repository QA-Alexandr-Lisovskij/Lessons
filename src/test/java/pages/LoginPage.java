package pages;

import baseEntities.BasePage;
import core.ReadProperties;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private static final String ENDPOINT = "/auth/login";
    private static final By PAGE_OPENED_IDENTIFIER = By.className("logo-loginpage");
    private final By emailField = By.id("name");
    private final By passwordField = By.id("password");
    private final By keepLoggedInCheckbox = By.className("loginpage-checkmark");
    private final By loginButton = By.id("button_primary");
    private final By forgotPasswordCheckbox = By.className("'loginpage-forgotpassword");

    public LoginPage(WebDriver driver){
        super(driver);
    }



    public WebElement Emailfield() {
        return driver.findElement(emailField);
    }

    public WebElement Passwordfield() {
        return driver.findElement(passwordField);
    }

    public WebElement LoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement KeeploggedinCheckbox() {
        return driver.findElement(keepLoggedInCheckbox);
    }

    public WebElement ForgotpasswordCheckbox() {
        return driver.findElement(forgotPasswordCheckbox);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public User getUser(){
        return new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());
    }

    public void login(User user) {
        Emailfield().sendKeys(user.getEmail());
        Passwordfield().sendKeys(user.getPassword());
        LoginButton().click();
    }
}
