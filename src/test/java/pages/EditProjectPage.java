package pages;

import models.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectPage extends AddProjectPage{
    public EditProjectPage(WebDriver driver) {
        super(driver);
    }

    private final By projectCompletedCheckbox = By.xpath("//strong[.='This project is completed']");

    public WebElement ProjectCompletedCheckbox() {
        return driver.findElement(projectCompletedCheckbox);
    }

    public void edit_project(Project project) {
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
