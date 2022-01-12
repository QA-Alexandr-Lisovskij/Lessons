package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;


public class SmokeTest extends BaseTest {


    @Test
    public void addProjectTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.isPageOpened();
        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());
        DashboardPage dashboardPage = new DashboardPage(driver);

//        dashboardPage.isPageOpened();
//        dashboardPage.getAddProjectBtnSidebar().click();
//        AddProjectPage addProjectPage = new AddProjectPage(driver);
//        addProjectPage.isPageOpened();
//        addProjectPage.add_project();
//        AdministrationPage administrationPage = new AdministrationPage(driver);
//        administrationPage.getPrjsRequiredProject();
//
    }


    @Test
    public void retryLoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.isPageOpened();
        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());
    }

}
