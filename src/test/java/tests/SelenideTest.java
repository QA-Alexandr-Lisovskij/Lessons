package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    String url = "https://qa1505.testrail.io";
    String username = "atrostyanko+0401@gmail.com";
    String password = "QqtRK9elseEfAk6ilYcJ";
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
        Configuration.headless = false;

        //начинаем тест
        open("/");


    }
}
