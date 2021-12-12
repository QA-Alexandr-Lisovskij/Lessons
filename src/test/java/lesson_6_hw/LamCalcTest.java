package lesson_6_hw;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LamCalcTest {
    public ChromeDriver driver;



    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Smoke Tests start");
    }

    @Test
    public void checkEUHCalc() {
        //Описание переменных
        String roomWidth = "6";
        String roomHeight = "3";
        String lamWidth = "1300";
        String lamHeight = "192";
        String inPack = "12";
        String price = "500";
        String bias = "300";
        String wallDist = "10";
        String expectedSLam = "17.82 м2.";
        String expectedCount = "76 шт.";
        String expectedPacks = "7 шт.";
        String expectedPrice = "10483 руб.";
        String expectedOver = "8 шт.";
        String expectedTrash = "4 шт.";

        //Открытие страницы
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");

        //Описание элементов страницы
        WebElement weight = driver.findElement(By.id("el_f_width"));
        WebElement length = driver.findElement(By.id("el_f_lenght"));
        WebElement roomElement = driver.findElement(By.id("room_type"));
        Select typeRoom = new Select(roomElement);
        WebElement heatingElement = driver.findElement(By.id("heating_type"));
        Select typHeating = new Select(heatingElement);
        WebElement heatLoss = driver.findElement(By.id("el_f_losses"));
        WebElement calculate = driver.findElement(By.cssSelector("input[type = 'button']"));

        //Выполнение теста

        typeRoom.selectByIndex(1);
        typHeating.selectByIndex(1);

        calculate.click();
        String actualFloorCablePower = driver.findElement(By.id("floor_cable_power")).getAttribute("value");
        String actualSpecFloorCablePower = driver.findElement(By.id("spec_floor_cable_power")).getAttribute("value");


        System.out.println("The Calculator test is completed");
    }

    @AfterTest(alwaysRun = true)
    public void close(){
        driver.quit();
        System.out.println("Smoke Tests close");
    }
}
 
