package pages;

import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;

public class AdministrationPage extends HeaderBar {
    private static String ENDPOINT = "/dashboard";
    private final By prjsRequiredProject = By.xpath("//a[contains(text(),"+ ReadProperties.getProjectName()+")]");
    public AdministrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPrjsRequiredProject() {
        return driver.findElement(prjsRequiredProject);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }
}
