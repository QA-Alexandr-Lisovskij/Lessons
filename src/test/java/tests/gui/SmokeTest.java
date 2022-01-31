package tests.gui;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import steps.ProjectSteps;


public class SmokeTest extends BaseTest {


    @Test(priority = 1)
    public void addProjectTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        //loginPage.login(loginPage.getUser());
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.addProject();
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.add_project(project.getRandomProject());
        AdministrationPage administrationPage = new AdministrationPage(driver);
        administrationPage.Administration().click();
        Assert.assertTrue(waits.waitForVisibility(administrationPage.NameProjectField()));
    }

    @Test(priority = 2)
    public void updateProjectTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
       //loginPage.login(loginPage.getUser());
        AdministrationPage administrationPage = new AdministrationPage(driver);
        administrationPage.Administration().click();
        administrationPage.NameProjectField().click();
        EditProjectPage editProjectPage = new EditProjectPage(driver);
        editProjectPage.edit_project(project.getRandomProject());
        Assert.assertTrue(waits.waitForVisibility(administrationPage.NameProjectField()));
    }

    @Test
    public void stepTest(){
        ProjectSteps projectSteps = new ProjectSteps(driver);
        projectSteps.addProject(project.getRandomProject());
        Assert.assertTrue(true);
    }
}
