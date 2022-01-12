package pagebars;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderBar extends BasePage {
    private final By bannerLink = By.id("bannerLink");
    private final By dashboard = By.id("navigation-dashboard");
    private final By аdministration = By.id("navigation-admin");
    private final By workDropdown = By.xpath("//*[@class='caret']");
    private final By workStatus = By.xpath("//h2[@class='top']");
    private final By userDropdown = By.id("navigation-user");
    private final By userSettings = By.id("navigation-user-settings");
    private final By userLogout = By.id("navigation-user-logout");
    private final By helpDropdown = By.id("navigation-menu");
    private final By helpLinkUserGuide = By.xpath("//a[contains(text(),'TestRail User Guide')]");
    private final By helpLinkSupportAndVideos = By.xpath("//a[contains(text(),'Support & Videos')]");
    private final By helpLinkCommunityForum  = By.xpath("//a[contains(text(),'Community Forum ')]");
    private final By helpLinkKeyboardShortcuts = By.xpath("//a[contains(text(),'Keyboard Shortcuts')]");
    private final By helpLinkGurockBlog = By.xpath("//a[contains(text(),'Gurock Blog')]");
    private final By helpLinkTwitter = By.xpath("//a[contains(text(),'TestRail on Twitter')]");
    private final By helpLinkWeb = By.xpath("//a[contains(text(),'TestRail on the Web')]");
    private final By helpLinkNewsletter = By.xpath("//a[contains(text(),'Subscribe to Newsletter')]");
    private final By helpSurvey = By.xpath("//a[contains(text(),'TestRail Survey')]");
    private final By helpAboutTestRail = By.xpath("//a[contains(text(),'About TestRail')]");
    private final By linkMail = By.className("icon-header-mail");
    private final By linkTwitter = By.className("icon-header-twitter");
    private final By linkBlog = By.className("icon-header-blog");

    public HeaderBar(WebDriver driver) {
        super(driver);
    }

    @Override
    protected void openPage() {
    }

    public WebElement getBannerLink() {
        return driver.findElement(bannerLink);
    }

    public WebElement getDashboard() {
        return driver.findElement(dashboard);
    }

    public WebElement getAdministration() {
        return driver.findElement(аdministration);
    }

    public WebElement getWorkDropdown() {
        return driver.findElement(workDropdown);
    }

    public WebElement getWorkStatus() {
        return driver.findElement(workStatus);
    }

    public WebElement getUserDropdown() {
        return driver.findElement(userDropdown);
    }

    public WebElement getUserSettings() {
        return driver.findElement(userSettings);
    }

    public WebElement getUserLogout() {
        return driver.findElement(userLogout);
    }

    public WebElement getHelpDropdown() {
        return driver.findElement(helpDropdown);
    }

    public WebElement getHelpLinkUserGuide() {
        return driver.findElement(helpLinkUserGuide);
    }

    public WebElement getHelpLinkSupportAndVideos() {
        return driver.findElement(helpLinkSupportAndVideos);
    }

    public WebElement getHelpLinkCommunityForum() {
        return driver.findElement(helpLinkCommunityForum);
    }

    public WebElement getHelpLinkKeyboardShortcuts() {
        return driver.findElement(helpLinkKeyboardShortcuts);
    }

    public WebElement getHelpLinkGurockBlog() {
        return driver.findElement(helpLinkGurockBlog);
    }

    public WebElement getHelpLinkTwitter() {
        return driver.findElement(helpLinkTwitter);
    }

    public WebElement getHelpLinkWeb() {
        return driver.findElement(helpLinkWeb);
    }

    public WebElement getHelpLinkNewsletter() {
        return driver.findElement(helpLinkNewsletter);
    }

    public WebElement getHelpSurvey() {
        return driver.findElement(helpSurvey);
    }

    public WebElement getHelpAboutTestRail() {
        return driver.findElement(helpAboutTestRail);
    }

    public WebElement getLinkMail() {
        return driver.findElement(linkMail);
    }

    public WebElement getLinkTwitter() {
        return driver.findElement(linkTwitter);
    }

    public WebElement getLinkBlog() {
        return driver.findElement(linkBlog);
    }



}
