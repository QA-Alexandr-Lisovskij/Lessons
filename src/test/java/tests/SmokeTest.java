package tests;

import baseEntities.BaseTest;
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
        dashboardPage.AddProjectButton().click();
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.add_project(addProjectPage.getRandomProject());
        AdministrationPage administrationPage = new AdministrationPage(driver);
        waits.waitForVisibility(administrationPage.NameProjectField());
    }

}
