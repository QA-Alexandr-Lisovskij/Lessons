package pages;

import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;

public class AdministrationPage extends HeaderBar {
    private static String ENDPOINT = "/dashboard";
    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//div[contains(text(),'All Projects')]");
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

    @Override
    public boolean isPageOpened(){
        try {
            return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }
}
