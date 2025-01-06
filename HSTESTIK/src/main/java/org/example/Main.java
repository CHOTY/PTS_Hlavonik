package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\marianna\\IdeaProjects\\Testovanie\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://ais2.ukf.sk/ais/start.do");
        try {
            driver.manage().window().maximize();
            WebElement cookie = driver.findElement(By.id("accept-cookies"));
            cookie.click();
            WebElement login = driver.findElement(By.id("login"));
            WebElement password = driver.findElement(By.id("heslo"));
            String meno = your_name;
            String pass = your_password;
            login.sendKeys(meno);
            password.sendKeys(pass);
            WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form-submit-btn\"]"));
            submit.submit();
            Thread.sleep(8000);
            WebElement schedule = driver.findElement(By.xpath("//*[@id=\"col3\"]/app-body/div[1]/div/app-rozvrh/div/div/button"));
            schedule.click();
            Thread.sleep(5000);
            WebElement podrazka = driver.findElement(By.xpath("/html/body/app-root/div/app-rozvrh/div[2]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", podrazka);
            Thread.sleep(1000);
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
            Thread.sleep(3000);
            WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/lib-app-header/nav/div[3]/a/span"));
            dropdown.click();
            Thread.sleep(3000);
            WebElement logout = driver.findElement(By.xpath("/html/body/app-root/lib-app-header/nav/div[3]/div/a"));
            logout.click();
            Thread.sleep(2000);


        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}