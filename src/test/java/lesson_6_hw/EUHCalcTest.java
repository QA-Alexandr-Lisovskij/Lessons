package lesson_6_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EUHCalcTest {
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
        String weightValue = "24";
        String lengthValue = "37";
        String heatLossValue = "280";
        String expectedFloorCablePower = "294";
        String expectedSpecFloorCablePower = "0";

        //Открытие страницы
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

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
        weight.sendKeys(weightValue);
        length.sendKeys(lengthValue);
        typeRoom.selectByIndex(1);
        typHeating.selectByIndex(1);
        heatLoss.sendKeys(heatLossValue);
        calculate.click();
        String actualFloorCablePower = driver.findElement(By.id("floor_cable_power")).getAttribute("value");
        String actualSpecFloorCablePower = driver.findElement(By.id("spec_floor_cable_power")).getAttribute("value");
        Assert.assertEquals(actualFloorCablePower, expectedFloorCablePower);
        Assert.assertEquals(actualSpecFloorCablePower, expectedSpecFloorCablePower);

        System.out.println("The EUHCalculator test is completed");
    }

    @AfterTest(alwaysRun = true)
    public void close(){
        driver.quit();
        System.out.println("Smoke Tests close");
    }
}
