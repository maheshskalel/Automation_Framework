package Generic_hyb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Script 
{
	public WebDriver driver;
	  @BeforeMethod
	  public void OpenAppln()
	 {
		//System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		//driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //driver.get("https://www.facebook.com/");
	    driver.get("https://www.amazon.in/");
	 }
	  @AfterMethod
	  public void CloseAppln()
	 {
	  driver.close();	
	 }
}
