package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.Select.*;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openRegistrationPage(){
        WebElement RegisterBtn = driver.findElement(By.className("ico-register"));
        clickButton(RegisterBtn);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"HJup0\"]/div/label/input")
        ));

        // Click the checkbox
        checkbox.click();
        System.out.println("Checkbox clicked successfully!");
    }
   public void openLoginPage (){
        WebElement loginLink = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));

        clickButton(loginLink);

       WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"HJup0\"]/div/label/input"));


       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // Click the checkbox
       checkbox.click();
       System.out.println("Checkbox clicked successfully!");
   }
   public void clickOnComputer (){
        WebElement ComputerLinkBtn =driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        clickButton(ComputerLinkBtn);

       WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"HJup0\"]/div/label/input"));


       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // Click the checkbox
       checkbox.click();
       System.out.println("Checkbox clicked successfully!");
   }
   public  void clickOnContactUs(){
        WebElement ContactUsBTN =driver.findElement(By.linkText("Contact us"));
     clickButton(ContactUsBTN);

       WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"HJup0\"]/div/label/input"));


       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // Click the checkbox
       checkbox.click();
       System.out.println("Checkbox clicked successfully!");
   }
   public void changeCurrency() {

       Select currency = new Select(driver.findElement(By.id("customerCurrency")));
         currency.deselectByVisibleText("Euro");

       WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"HJup0\"]/div/label/input"));


       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // Click the checkbox
       checkbox.click();
       System.out.println("Checkbox clicked successfully!");

   }

}
