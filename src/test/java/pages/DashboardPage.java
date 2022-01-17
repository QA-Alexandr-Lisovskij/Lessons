package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;


public class DashboardPage extends HeaderBar {
    private static final String ENDPOINT = "/dashboard";
    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//div[contains(text(),'All Projects')]");
    private final By addProjectButton = By.id("navigation-empty-addproject");
    private final By addProjectButtonSidebar = By.id("sidebar-projects-add");
    private final By addExampleProjectButton = By.id("navigation-empty-addexampleproject");
    private final By displayDetailView = By.className("icon-display-large");
    private final By displayCompactView = By.className("icon-display-small-inactive");
    private final By navigationProjectName = By.id("navigation-project");

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isPageOpened(){
        try {
            return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public WebElement AddProjectButton() {
        return driver.findElement(addProjectButton);
    }

    public WebElement AddProjectButtonSidebar() {
        return driver.findElement(addProjectButtonSidebar);
    }

    public WebElement AddExampleProjectButton() {
        return driver.findElement(addExampleProjectButton);
    }

    public WebElement DisplayDetailView() {
        return driver.findElement(displayDetailView);
    }

    public WebElement DisplayCompactView() {
        return driver.findElement(displayCompactView);
    }

    public WebElement NavigationProjectName() {
        return driver.findElement(navigationProjectName);
    }




}
