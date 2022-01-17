package tests;

import baseEntities.BaseTest;
import models.Milestone;
import models.Project;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.MilestoneSteps;
import steps.ProjectSteps;

public class MileStoneTests extends BaseTest {

    @Test
    public void test1(){
        Project project = new Project();
        User user = new User();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(loginPage.getUser());
        ProjectSteps projectSteps = new ProjectSteps(driver);
        projectSteps.addProject(project);
        MilestoneSteps milestoneSteps = new MilestoneSteps(driver);
        milestoneSteps.addMilestone(project);

    }
}
