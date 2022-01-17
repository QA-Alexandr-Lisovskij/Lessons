package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.AdministrationPage;
import pages.DashboardPage;
import pages.LoginPage;


public class SmokeTest extends BaseTest {


    @Test
    public void addProjectTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(loginPage.getUser());
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.addProject();
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.add_project(addProjectPage.getRandomProject());
        AdministrationPage administrationPage = new AdministrationPage(driver);
        administrationPage.Administration().click();
        Assert.assertTrue(waits.waitForVisibility(administrationPage.NameProjectField()));
    }

    @Test
    public void updateProjectTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(loginPage.getUser());
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.AddProjectButton().click();
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.add_project(addProjectPage.getRandomProject());
        AdministrationPage administrationPage = new AdministrationPage(driver);
        Assert.assertTrue(waits.waitForVisibility(administrationPage.NameProjectField()));
    }
}
