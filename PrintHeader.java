package Selenium.Locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeader {

    @Test

    public void PrintHeader(){

       System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("http://amazon.com");

        WebElement searchHeader = driver.findElement(By.id("twotabsearchtextbox"));
        searchHeader.sendKeys("Iphone12" + Keys.ENTER);

        WebElement firstElement = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        firstElement.click();
        String firstElementTitle = driver.getTitle();
        System.out.println(firstElementTitle);







    }


}
