package pages;

import core.ReadProperties;
import models.Project;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;

import java.util.Arrays;
import java.util.Random;

public class AddProjectPage extends HeaderBar {
    private static final String ENDPOINT = "/admin/projects/add/1";
    private static final By PAGE_OPENED_IDENTIFIER = By.id("accept");
    private final By projectsSettings = By.id("projects-tabs-project");
    private final By prjNameField = By.id("name");
    private final By prjAnnouncementField = By.id("announcement");
    private final By prjShowAnnouncementCheckbox = By.id("show_announcement");
    private final By prjSuiteModeSingleCheckbox = By.id("suite_mode_single");
    private final By prjSuiteModeSingleBaselineCheckbox = By.id("suite_mode_single_baseline");
    private final By prjSuiteModeMultiCheckbox = By.id("suite_mode_multi");
    private final By accessSettings = By.id("projects-tabs-access");
    private final By acceptButton = By.id("accept");
    private final By cancelButton = By.xpath("//a[contains(text(),'Cancel')][1]");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public WebElement ProjectsSettings() {
        return driver.findElement(projectsSettings);
    }

    public WebElement PrjNameField() {
        return driver.findElement(prjNameField);
    }

    public WebElement PrjAnnouncementField() {
        return driver.findElement(prjAnnouncementField);
    }

    public WebElement PrjShowAnnouncementCheckbox() {
        return driver.findElement(prjShowAnnouncementCheckbox);
    }

    public WebElement PrjSuiteModeSingleCheckbox() {
        return driver.findElement(prjSuiteModeSingleCheckbox);
    }

    public WebElement PrjSuiteModeSingleBaselineCheckbox() {
        return driver.findElement(prjSuiteModeSingleBaselineCheckbox);
    }

    public WebElement PrjSuiteModeMultiCheckbox() {
        return driver.findElement(prjSuiteModeMultiCheckbox);
    }

    public WebElement AccessSettings() {
        return driver.findElement(accessSettings);
    }

    public WebElement AcceptButton() {
        return driver.findElement(acceptButton);
    }

    public WebElement CancelButton() {
        return driver.findElement(cancelButton);
    }





    public void add_project(Project project) {
        PrjNameField().sendKeys(project.getProjectName());
        PrjAnnouncementField().sendKeys(project.getProjectAnnouncement());
        if (project.isShowAnnouncement()) {
            PrjShowAnnouncementCheckbox().click();
        }
        switch (project.getProjectType()) {
            case "suite_mode_single" -> PrjSuiteModeSingleCheckbox().click();
            case "suite_mode_single_baseline" -> PrjSuiteModeSingleBaselineCheckbox().click();
            case "suite_mode_multi" -> PrjSuiteModeMultiCheckbox().click();
            default -> throw new IllegalStateException("Unexpected value: " + project.getProjectType());
        }
        AcceptButton().click();
    }


}

