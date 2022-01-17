package pages;

import models.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;

public class AdministrationPage extends HeaderBar {
    Project project = new Project();
    private static final String ENDPOINT = "/admin/projects/overview";
    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//*[@id=\"content-header\"]/div/div[2]");
    private final By nameProjectField = By.xpath("//a[contains(text()," + project.getProjectName() + ")]");
    private final By deleteProjectButton = By.className("icon-small-delete");
    private final By editProjectButton = By.className("icon-small-edit");
    private final By deleteProjectCheckbox = By.name("deleteCheckbox");
    private final By deleteOkButton = By.className("button button-ok button-left button-positive dialog-action-default");

    public AdministrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement NameProjectField() {
        return driver.findElement(nameProjectField);
    }

    public WebElement DeleteProjectButton() {
        return driver.findElement(deleteProjectButton);
    }

    public WebElement EditProjectButton() {
        return driver.findElement(editProjectButton);
    }

    public WebElement DeleteProjectCheckbox() {
        return driver.findElement(deleteProjectCheckbox);
    }

    public WebElement DeleteOkButton() {
        return driver.findElement(deleteOkButton);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }
}
