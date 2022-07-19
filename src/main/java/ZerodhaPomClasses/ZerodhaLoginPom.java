package ZerodhaPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPom {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()='Login '] ")
	private WebElement ClickLoginBtn;
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement Otp;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement Continue;
	
	public ZerodhaLoginPom(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}

	public void setUserName(String Uname)
	{
		UserName.sendKeys(Uname);
	}
	
	public void setPassword(String Pwd)
	{
		Password.sendKeys(Pwd);
	}
	
	public void ClickLoginBtn()
	{
		ClickLoginBtn.click();
	}
	
	public void setPin()
	{
		Otp.sendKeys("959594");
	}
	
	public void clickContinue()
	{
		Continue.click();
	}
	

}
