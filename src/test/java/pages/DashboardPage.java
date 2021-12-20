package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagebars.HeaderBar;


public class DashboardPage extends HeaderBar {

    private final By PAGE_OPENED_IDENTIFIER = By.xpath("//div[contains(text(),'All Projects')]");
    private final By addProjectBtn = By.id("navigation-empty-addproject");
    private final By addProjectBtnSidebar = By.id("sidebar-projects-add");
    private final By addExampleProjectBtn = By.id("navigation-empty-addexampleproject");
    private final By displayDetailView = By.className("icon-display-large");
    private final By displayCompactView = By.className("icon-display-small-inactive");
    private final By navigationProjectName = By.id("navigation-project");

    public DashboardPage(WebDriver driver){
        super(driver);
    }
    public boolean isPageOpened(){
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }

    public WebElement getAddProjectBtn() {
        return driver.findElement(addProjectBtn);
    }

    public WebElement getAddProjectBtnSidebar() {
        return driver.findElement(addProjectBtnSidebar);
    }

    public WebElement getAddExampleProjectBtn() {
        return driver.findElement(addExampleProjectBtn);
    }

    public WebElement getDisplayDetailView() {
        return driver.findElement(displayDetailView);
    }

    public WebElement getDisplayCompactView() {
        return driver.findElement(displayCompactView);
    }

    public WebElement getNavigationProjectName() {
        return driver.findElement(navigationProjectName);
    }


}
