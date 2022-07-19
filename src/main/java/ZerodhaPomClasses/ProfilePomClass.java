package ZerodhaPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePomClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement clickUser;
	
	@FindBy(xpath="(//span[text()='TATAPOWER'])[1]")
	private WebElement TataMotor;
	
	@FindBy(xpath="(//span[@class='change-indicator icon icon-chevron-down'])[1]")
	private WebElement clickBuyTataMotor;
	
	
	public ProfilePomClass(WebDriver d2)
	{
		driver=d2;
		PageFactory.initElements(d2,this);
	}
	
	public void clickUser()
	{
		Actions a=new Actions(driver);
		a.moveToElement(clickUser).click(clickUser).build().perform();
	}
	
	public void clickTataMotor()
	{
		Actions b=new Actions(driver);
		
		b.moveToElement(TataMotor).click(TataMotor).build().perform();
	}

	public void clickBuyTataMotor()
	{
		Actions b=new Actions(driver);
		b.moveToElement(clickBuyTataMotor).click(clickBuyTataMotor).build().perform();
	}
}
