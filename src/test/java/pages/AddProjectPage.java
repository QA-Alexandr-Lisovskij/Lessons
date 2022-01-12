package pages;

import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;

public class AddProjectPage extends HeaderBar {
    private static String ENDPOINT = "/dashboard";
    private final By PAGE_OPENED_IDENTIFIER = By.id("accept");
    private final By projectsSettings = By.id("projects-tabs-project");
    private final By prjNameField = By.id("name");
    private final By prjAnnouncementField = By.id("announcement");
    private final By prjShowAnnouncement = By.id("show_announcement");
    private final By prjSuiteModeSingle = By.id("suite_mode_single");
    private final By prjSuiteModeSingleBaseline = By.id("suite_mode_single_baseline");
    private final By prjSuiteModeMulti = By.id("suite_mode_multi");
    private final By accessSettings = By.id("projects-tabs-access");
    private final By addProjectBtn = By.id("accept");
    private final By cancelBtn =By.xpath("//a[contains(text(),'Cancel')][1]");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }

    public WebElement getProjectsSettings() {
        return driver.findElement(projectsSettings);
    }

    public WebElement getPrjNameField() {
        return driver.findElement(prjNameField);
    }

    public WebElement getPrjAnnouncementField() {
        return driver.findElement(prjAnnouncementField);
    }

    public WebElement getPrjShowAnnouncement() {
        return driver.findElement(prjShowAnnouncement);
    }

    public WebElement getPrjSuiteModeSingle() {
        return driver.findElement(prjSuiteModeSingle);
    }

    public WebElement getPrjSuiteModeSingleBaseline() {
        return driver.findElement(prjSuiteModeSingleBaseline);
    }

    public WebElement getPrjSuiteModeMulti() {
        return driver.findElement(prjSuiteModeMulti);
    }

    public WebElement getAccessSettings() {
        return driver.findElement(accessSettings);
    }

    public WebElement getAddProjectBtn() {
        return driver.findElement(addProjectBtn);
    }

    public WebElement getCancelBtn() {
        return driver.findElement(cancelBtn);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public void add_project(){
        getPrjNameField().sendKeys(ReadProperties.getProjectName());
        getPrjAnnouncementField().sendKeys(ReadProperties.getProjectAnnouncement());
        getPrjSuiteModeSingle().click();
        getAddProjectBtn().click();
    }


}

