package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\index\\driver\\chromedriver-win64\\chromedriver.exe");
   //     System.setProperty("webdriver.http.factory", "jdk-http-client");
//        WebDriverManager.chromedriver().clearDriverCache().setup();
//        WebDriverManager.chromedriver().clearResolutionCache().setup();

        ChromeOptions options =new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

//        ուղղակի սպասում
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        անուղղակի սպասում
        WebElement element = (new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));


        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();

     //   WebElement input = driver.findElement(By.xpath("aria-label=\"Поиск в Google\""));

      //  input.click();

    }
}