package elements;

import org.openqa.selenium.*;

public class Button {
    private UIElement uiElement;

    public Button(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver,by);
    }

    public Button(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver,webElement);
    }


    public void click() {
       uiElement.click();
    }
}
