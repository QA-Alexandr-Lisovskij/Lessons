package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.AssertionMode.*;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
@Listeners({SoftAsserts.class})
public class SelenideTest {
    String url = "https://qa1505.testrail.io";
    String username = "atrostyanko+0401@gmail.com";
    String password = "QqtRK9elseEfAk6ilYcJ";
    private final By emailField = By.id("name");
    private final By passwordField = By.id("password");
    private final By keepLoggedInCheckbox = By.className("loginpage-checkmark");
    private final By loginButton = By.id("button_primary");
    private final By forgotPasswordCheckbox = By.className("'loginpage-forgotpassword");

    @BeforeSuite
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        // or for fine-tuning:
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true)
        );
    }

    @Test
    public void userCanLogin(){
        //НАСТРОЙКА ЛОГЕРА
        org.apache.log4j.BasicConfigurator.configure();

        //НАСТРОЙКА СЕЛЕНИДА
        Configuration.baseUrl = url;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.fastSetValue = true;
        Configuration.timeout = 8000;
        Configuration.headless = true;
        Configuration.assertionMode = SOFT;

        //начинаем тест
        open("/");
        $(By.id("name")).setValue(username);
        $("#password").val(password);
        $("#button_primary").click();
        $(".page_title").shouldBe(visible).shouldHave(text("All Projects"));
        open("/index.php?/admin/projects/overview");
        $$(By.className("hoverSensitive"))
                .shouldHaveSize(388)
                .find(text("12345"))
                .find(By.tagName("a"))
                .click();

        $("#announcement")
                .should(exist)
                .shouldBe(visible)
                .shouldHave(exactText("This is the description for the project1"));


    }

    @Test
    public void test1(){
        //НАСТРОЙКА ЛОГЕРА
        org.apache.log4j.BasicConfigurator.configure();

        //НАСТРОЙКА СЕЛЕНИДА
        Configuration.baseUrl = url;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.fastSetValue = true;
        Configuration.timeout = 8000;
        Configuration.headless = true;
        Configuration.assertionMode = SOFT;

        //начинаем тест
        open("/");
        $(By.id("name")).setValue(username);
        $("#password").val(password);
        $("#button_primary").click();
        $(".page_title").shouldBe(visible).shouldHave(text("All Projects"));

        $$(".chart-legend-name")
                .filter(visible)
                .shouldHave(texts("123456","aaaDencheck","aaaDencheck","aaaDencheck"));

    }

    @Test
    public void test2(){
        //НАСТРОЙКА ЛОГЕРА
        org.apache.log4j.BasicConfigurator.configure();

        //НАСТРОЙКА СЕЛЕНИДА
        Configuration.baseUrl = url;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.fastSetValue = true;
        Configuration.timeout = 8000;
        Configuration.headless = true;
        Configuration.assertionMode = SOFT;

        //начинаем тест
        open("/");
        $(By.id("name")).setValue(username);
        $("#password").val(password);
        $("#button_primary").click();
        $(".page_title").shouldBe(visible).shouldHave(text("All Projects"));
        $(byText("ahlhtdgk")).shouldBe(visible);
        $(withText("123")).shouldBe(visible);

        SelenideElement parent = $(byText("ahlhtdgk")).parent();
        System.out.println(parent.getTagName());


    }
}
