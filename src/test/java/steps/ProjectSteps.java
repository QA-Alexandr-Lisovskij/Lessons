package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import models.Project;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProjectSteps extends BaseStep {

    public ProjectSteps(WebDriver driver) {
        super(driver);
    }

    @Step
    public void addProject(Project project){
        System.out.println("шаг степа");
        Assert.assertTrue(true);
    }

    public void updateProject(Project currentProject, Project newProject){

    }

    public void deleteProject(Project project){

    }
}
