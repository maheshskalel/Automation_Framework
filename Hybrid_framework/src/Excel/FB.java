package Excel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB extends Generic_DDT
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys (ddt("Sheet1",0,0));
	driver.findElement(By.id("pass")).sendKeys (ddt("Sheet1",0,1));
	driver.findElement(By.name("login")).click();

}
}
	