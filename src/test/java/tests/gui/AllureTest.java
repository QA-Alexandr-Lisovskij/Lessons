package tests.gui;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureTest {

    @Test(description = "Human-readable test name")
    public void testName(){
        Assert.assertTrue(true);
    }

    @Test
    @Description("descamble test name")
    public void testDescription(){
        Assert.assertTrue(true);
    }

    @Test
    @Issue("PR-123")
    @Issue("PR-456")
    public void testIssue(){
        Assert.assertTrue(true);
    }

    @Test
    @TmsLink("TMS-123")
    @TmsLink("TMS-456")
    public void testTms(){
        Assert.assertTrue(true);
    }

    @Test
    @Link("https://russianblogs.com/")
    @Link(name = "allure link",type = "Mylink", url = "https://russianblogs.com/")
    public void testLink(){
        Assert.assertTrue(true);
    }


}
