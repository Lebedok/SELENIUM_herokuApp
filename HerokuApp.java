package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
    1. Navigate to http://the-internet.herokuapp.com/
    2. Locate and click on A/B Testing link
    3. Print out the title on A/B Testing page
 */

public class HerokuApp {
    @Test

    public void abTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement abTestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.click();
        String title = driver.getTitle();
        System.out.println("AB test page's title is "+ title);

    }

    @Test

    public void dropDownTest(){
        //provide chrome driver location
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        //Instantiate chrome browser object
        WebDriver driver = new ChromeDriver();
        // navigate to web site
        driver.get("http://the-internet.herokuapp.com/");
        // Locate web element
        WebElement dropdownLink = driver.findElement(By.xpath("//a[@href='/dropdown']"));

        String dropdownText = dropdownLink.getText();
        System.out.println(dropdownText);



    }

    @Test

    public void test4(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen();   // maximize();

        //  driver.quit();
        //  driver.close();

    }

    @Test

     /*
    1. Navigate to herokaupp
    2. click on ab test
    3. print out the title
    4. navigate back to home page
    5. click on checkboxes link
    6. print out the title of checkboxes page
     */

    public void navigation(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen();   // maximize();

        WebElement abTestLink = driver.findElement(By.xpath("//a[@href = '/abtest']"));
        abTestLink.click();
        String abTestTitle = driver.getTitle();


        driver.navigate().back();
        WebElement checkboxLink = driver.findElement(By.xpath("//a[@href = '/checkboxes']"));
        checkboxLink.click();
        String checkboxTitle = driver.getTitle();
        System.out.println(abTestTitle);
        System.out.println(checkboxTitle);


    }


}
