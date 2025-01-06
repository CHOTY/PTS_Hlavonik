package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\marianna\\IdeaProjects\\Testovanie\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\marianna\\IdeaProjects\\Testovanie\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        /*
        driver.get("https://ais2.ukf.sk/ais/start.do");
        WebElement cookieButton= driver.findElement(By.xpath("/html/body/div[6]/button[1]"));
        cookieButton.click();

        WebElement username= driver.findElement(By.id("login"));
        WebElement password= driver.findElement(By.id("heslo"));
        String meno=your_name;
        String heslo=your_password;
        WebElement link= driver.findElement(By.linkText("Nastavenia"));
        //WebElement link= driver.findElement(By.partialLinkText("Pre"));
        //WebElement link= driver.findElement(By.cssSelector("input[class=login]"));
        username.sendKeys(link.getText());
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){throw new RuntimeException(e);
        }
        password.sendKeys(heslo);
        WebElement submit=driver.findElement(By.id("login-form-submit-btn"));
        submit.submit();
       /* WebElement username1= driver.findElement(By.name("login"));*/
        /* WebElement c=driver.findElement(By.className());*/
        /* WebElement c=driver.findElement(By.tagName("body"));*/

        //HODINA 2

        /*
        driver.get("https://sk.wikipedia.org/wiki/Hlavn%C3%A1_str%C3%A1nka");
        WebElement a=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/div/table[3]/tbody/tr/td[1]/table/tbody/tr[1]/td/div/div[1]/div[2]/b/a"));
        WebElement b=driver.findElement(By.id("skin-client-pref-vector-feature-custom-font-size-value-1"));
        WebElement c=driver.findElement(By.name("skin-client-pref-vector-feature-custom-font-size-group"));
        List<WebElement> d=driver.findElements(By.tagName("table"));
        WebElement e=driver.findElement(By.linkText("Felix Baumgartner"));
        WebElement f=driver.findElement(By.partialLinkText("Baumgartner"));
        System.out.println(a.getText());
        System.out.println(b.getAttribute("value"));
        System.out.println(c.getAttribute("id"));
        System.out.println(e.getAttribute("href"));
        System.out.println(f.getAttribute("href"));
        System.out.println(d.get(1).getAttribute("id"));
        WebElement g=driver.findElement(By.cssSelector("#mp-upper > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)"));
        System.out.println(g.getAttribute("title"));
        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){throw new RuntimeException(ex);
        }finally {
            driver.quit();
        }
        */

        //HODINA 3
        /*
        driver.get("https://www.amazon.de");
        try {
            WebElement cookiebutton = driver.findElement(By.xpath("//*[@id=\"sp-cc-accept\"]"));
            cookiebutton.click();
            Thread.sleep(1000);

            WebElement selectBox = driver.findElement(By.id("searchDropdownBox"));
            Select dropdown = new Select(selectBox);

            // Získame všetky možnosti v zozname
            List<WebElement> options = dropdown.getOptions();
            // Prejdeme všetky možnosti a vypíšeme ich text do konzoly
            for (WebElement option : options) {
                if(option.getText().equals("PC & Video Games")) {
                    System.out.println("Ano selectBox obsahuje PC & Video Games");
                }
                System.out.println("Option text: " + option.getText() + " " + "Option value: " + option.getAttribute("value"));
            }
            Thread.sleep(2000);
            dropdown.selectByIndex(5);
            Thread.sleep(2000);
            dropdown.selectByValue("search-alias=photo");
            Thread.sleep(5000);
            dropdown.selectByVisibleText("   Ženy");
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
         */
        //HODINA 4
        /*
        driver.get("https://myanimelist.net/anime/54492/Kusuriya_no_Hitorigoto");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Thread.sleep(2000);
            WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/button[3]"));
            cookiesButton.click();
            Thread.sleep(1000);
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
            ((JavascriptExecutor)driver).executeScript("window.open()");

            // Získame handle na všetky otvorené okná/taby
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());

            // Prepneme sa na nový tab, ktorý bude druhý v zozname
            driver.switchTo().window(tabs.get(1));
            driver.get("https://studentmail.ukf.sk/webmail/");
            Thread.sleep(1000);
            WebElement username= driver.findElement(By.xpath("//*[@id=\"rcmloginuser\"]"));
            WebElement password= driver.findElement(By.xpath("//*[@id=\"rcmloginpwd\"]"));
            String meno="307393";
            String heslo="0108273264";
            username.sendKeys(meno);
            password.sendKeys(heslo);
            WebElement submit=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/p/input"));
            submit.submit();
            Thread.sleep(1000);
            WebElement newMail=driver.findElement(By.id("rcmbtn117"));
            newMail.click();
            Thread.sleep(1000);
            WebElement adresat=driver.findElement(By.id("_to"));
            WebElement Predmet=driver.findElement(By.id("compose-subject"));
            String adres="dhalvonik@ukf.sk";
            String predmet="Pokrocile Testovanie Softveru";
            adresat.sendKeys(adres);
            Predmet.sendKeys(predmet);
            WebElement priloh=driver.findElement(By.xpath("//*[@id=\"rcmbtn107\"]"));
            priloh.click();
            Thread.sleep(2000);
            WebElement priloha=driver.findElement(By.xpath("/html/body/div[4]/form/div[1]/input"));
            priloha.sendKeys("C:\\Users\\marti\\IdeaProjects\\Testovanie\\screenshot.png");
            WebElement nahrat=driver.findElement(By.xpath("//*[@id=\"attachment-form\"]/form/div[3]/input[2]"));
            nahrat.click();
            Thread.sleep(7000);
            WebElement send=driver.findElement(By.id("rcmbtn110"));
            send.click();
            Thread.sleep(5000);
            Thread.sleep(5000);  // Pozastaviť vykonávanie na 5 sekúnd
        }  catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    */
        // Test name: aa
        // Step # | name | target | value
        // 1 | open | https://www.bazos.cz/ |
        driver.get("https://www.bazos.cz/");
        // 2 | setWindowSize | 1161x789 |
        driver.manage().window().setSize(new Dimension(1161, 789));
        // 3 | click | linkText=PC |
        driver.findElement(By.linkText("PC")).click();
        // 4 | click | linkText=Grafické karty |
        driver.findElement(By.linkText("Grafické karty")).click();
        // 5 | click | linkText=AMD Radeon pro W5500 8gb professionalni graficka karta |
        WebElement jj=driver.findElement(By.linkText("AMD Radeon pro W5500 8gb professionalni graficka karta"));
        jj.click();
        String title=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/div[1]/h1")).getText();

        String filePath="C:\\Users\\marianna\\IdeaProjects\\Testovanie\\name.txt";
        String fileContent="";
        try {
            fileContent=new String(Files.readAllBytes(Paths.get(filePath)));
            if (fileContent.equals(title)) {
                System.out.println("Spravne");

            }else{
                System.out.println("Nespravne");
            }
        }catch (IOException e){System.out.println(e);}
        driver.quit();
    }
}