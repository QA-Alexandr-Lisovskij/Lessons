package lesson_6_hw;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LamCalcTest {
    public ChromeDriver driver;


    public void inputValue(String keys,WebElement element){
        if(keys.isEmpty()){
            return;
        }else{
            element.sendKeys(Keys.CONTROL + "a");
            element.sendKeys(Keys.DELETE);
            element.sendKeys(keys);
        }
    }

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
        String roomWidthValue = "6";
        String roomHeightValue = "3";
        String lamWidthValue = "1300";
        String lamHeightValue = "192";
        String inPackValue = "12";
        String priceValue = "500";
        String biasValue = "300";
        String wallDistValue = "10";
        String expectedSLam = "17.82 м2.";
        String expectedCount = "76 шт.";
        String expectedPacks = "7 шт.";
        String expectedPrice = "10483 руб.";
        String expectedOver = "8 шт.";
        String expectedTrash = "4 шт.";

        //Открытие страницы
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");

        //Описание элементов страницы
        WebElement roomWidth = driver.findElement(By.name("calc_roomwidth"));
        WebElement roomHeight = driver.findElement(By.name("calc_roomheight"));
        WebElement lamWidth = driver.findElement(By.name("calc_lamwidth"));
        WebElement lamHeight = driver.findElement(By.name("calc_lamheight"));
        WebElement inPack = driver.findElement(By.name("calc_inpack"));
        WebElement price = driver.findElement(By.name("calc_price"));
        WebElement bias = driver.findElement(By.name("calc_bias"));
        WebElement wallDist = driver.findElement(By.name("calc_walldist"));
        WebElement calc_direct = driver.findElement(By.name("calc_direct"));
        Select direction = new Select(calc_direct);
        WebElement calculate = driver.findElement(By.cssSelector("input[value='Рассчитать']"));

        //Выполнение теста

        inputValue(roomWidthValue,roomWidth);
        inputValue(roomHeightValue,roomHeight);
        inputValue(lamWidthValue,lamWidth);
        inputValue(lamHeightValue,lamHeight);
        inputValue(inPackValue,inPack);
        inputValue(priceValue,price);
        inputValue(biasValue,bias);
        inputValue(wallDistValue,wallDist);

        direction.selectByIndex(0);
        calculate.click();

        String actualSLam = driver.findElement(By.id("s_lam")).getText();
        String actualCount = driver.findElement(By.id("l_count")).getText();
        String actualPacks = driver.findElement(By.id("l_packs")).getText();
        String actualPrice = driver.findElement(By.id("l_price")).getText();
        String actualOver = driver.findElement(By.id("l_over")).getText();
        String actualTrash = driver.findElement(By.id("l_trash")).getText();

        Assert.assertEquals(actualSLam,expectedSLam);
        Assert.assertEquals(actualCount,expectedCount);
        Assert.assertEquals(actualPacks,expectedPacks);
        Assert.assertEquals(actualPrice,expectedPrice);
        Assert.assertEquals(actualOver,expectedOver);
        Assert.assertEquals(actualTrash,expectedTrash);

        System.out.println("The lamCalculator test is completed");
    }

    @AfterTest(alwaysRun = true)
    public void close(){
        driver.quit();
        System.out.println("Smoke Tests close");
    }
}
 
