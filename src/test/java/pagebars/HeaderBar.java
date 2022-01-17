package pagebars;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderBar extends BasePage {
    private static final By PAGE_OPENED_IDENTIFIER = By.id("bannerLink");
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
    private final By helpLinkCommunityForum = By.xpath("//a[contains(text(),'Community Forum ')]");
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

    @Override
    public boolean isPageOpened() {
        try {
            return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public WebElement BannerLink() {
        return driver.findElement(bannerLink);
    }

    public WebElement Dashboard() {
        return driver.findElement(dashboard);
    }

    public WebElement Administration() {
        return driver.findElement(аdministration);
    }

    public WebElement WorkDropdown() {
        return driver.findElement(workDropdown);
    }

    public WebElement WorkStatus() {
        return driver.findElement(workStatus);
    }

    public WebElement UserDropdown() {
        return driver.findElement(userDropdown);
    }

    public WebElement UserSettings() {
        return driver.findElement(userSettings);
    }

    public WebElement UserLogout() {
        return driver.findElement(userLogout);
    }

    public WebElement HelpDropdown() {
        return driver.findElement(helpDropdown);
    }

    public WebElement HelpLinkUserGuide() {
        return driver.findElement(helpLinkUserGuide);
    }

    public WebElement HelpLinkSupportAndVideos() {
        return driver.findElement(helpLinkSupportAndVideos);
    }

    public WebElement HelpLinkCommunityForum() {
        return driver.findElement(helpLinkCommunityForum);
    }

    public WebElement HelpLinkKeyboardShortcuts() {
        return driver.findElement(helpLinkKeyboardShortcuts);
    }

    public WebElement HelpLinkGurockBlog() {
        return driver.findElement(helpLinkGurockBlog);
    }

    public WebElement HelpLinkTwitter() {
        return driver.findElement(helpLinkTwitter);
    }

    public WebElement HelpLinkWeb() {
        return driver.findElement(helpLinkWeb);
    }

    public WebElement HelpLinkNewsletter() {
        return driver.findElement(helpLinkNewsletter);
    }

    public WebElement HelpSurvey() {
        return driver.findElement(helpSurvey);
    }

    public WebElement HelpAboutTestRail() {
        return driver.findElement(helpAboutTestRail);
    }

    public WebElement LinkMail() {
        return driver.findElement(linkMail);
    }

    public WebElement LinkTwitter() {
        return driver.findElement(linkTwitter);
    }

    public WebElement LinkBlog() {
        return driver.findElement(linkBlog);
    }


}
