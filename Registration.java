import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RegistrationPage {
WebDriver driver;
public void invokeBrowser() {
try {
{
System.setProperty(“webdriver.chrome.driver”, “D:\\Chrome\\chromedriver.exe”);
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
}
} catch (Exception e) {
e.printStackTrace();
}
}
public void registration() {
try {
{
driver.navigate().to(“http://facebook.com/”);
driver.findElement(By.id(“firstname”)).sendKeys(“deepa”);
driver.findElement(By.id(“lastname”)).sendKeys(“jain”);
//Radio button
driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[2]/div/div/input[1]”)).click();
//check b