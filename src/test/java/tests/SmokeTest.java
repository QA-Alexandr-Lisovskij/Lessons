package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;


public class SmokeTest extends BaseTest {


    @Test
    public void addProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.getAddProjectBtn().isDisplayed());
    }

}
