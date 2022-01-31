package tests.gui;

import baseEntities.BaseTest;
import models.Project;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.MilestoneSteps;
import steps.ProjectSteps;

public class MileStoneTests extends BaseTest {

    @Test
    public void test1(){
        Project project = new Project();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(loginPage.getUser());
        ProjectSteps projectSteps = new ProjectSteps(driver);
        projectSteps.addProject(project);
        MilestoneSteps milestoneSteps = new MilestoneSteps(driver);
        milestoneSteps.addMilestone(project);

    }
}
