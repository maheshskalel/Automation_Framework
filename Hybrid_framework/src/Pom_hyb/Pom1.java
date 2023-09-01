package Pom_hyb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{
	@FindBy (name="email")
	private WebElement pnTbox;
	@FindBy (id="pass")
	private WebElement pwdTbox;
	@FindBy (name="login")
	private WebElement loginBtn;

	//initialization
	public Pom1(WebDriver driver)
	 {
		super(driver);
	 }

	//utilization
	public void userName(String un)
	 {
	   pnTbox.sendKeys(un);
	 }
	public void  passWord(String pwd)
	 {
	   pwdTbox.sendKeys(pwd);
	 }
	public void cliklogin() 
	 {
		loginBtn.click();
	 }
}
