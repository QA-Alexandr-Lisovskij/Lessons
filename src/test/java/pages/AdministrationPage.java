package pages;

import common.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;

public class AdministrationPage extends HeaderBar {
    private final By prjsRequiredProject = By.xpath("//a[contains(text(),"+ ReadProperties.getProjectName()+")]");
    public AdministrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPrjsRequiredProject() {
        return driver.findElement(prjsRequiredProject);
    }
}
