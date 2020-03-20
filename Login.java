import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test;

public class LoginUsingSelenium {

    @Test public void login() { // TODO Auto-generated method stub 

  System.setProperty("webdriver.chrome.driver", "path of driver"); 

  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 

  driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110"); 

  WebElement username=driver.findElement(By.id("email")); 

  WebElement password=driver.findElement(By.id("pass")); 

  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 

  username.sendKeys("komalsinghal.656@gmail.com"); password.sendKeys("Komal@123"); 

  login.click(); String actualUrl="https://www.linkedin.com/feed/"; 

  String expectedUrl= driver.getCurrentUrl(); 

  Assert.assertEquals(expectedUrl,actualUrl); }   }