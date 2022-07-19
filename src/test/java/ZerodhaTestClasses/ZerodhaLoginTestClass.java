package ZerodhaTestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ZerodhaPomClasses.ProfilePomClass;
import ZerodhaPomClasses.ZerodhaLoginPom;

public class ZerodhaLoginTestClass extends BaseClass {
	
	@Test
	public void createObjectPom() throws InterruptedException
	{
		
		ZerodhaLoginPom z=new ZerodhaLoginPom(driver);
		
		Thread.sleep(3000);

		z.setUserName(Username);
		z.setPassword(Pwd);
		z.ClickLoginBtn();
		Thread.sleep(3000);

		z.setPin();
		z.clickContinue();
		
		ProfilePomClass p=new ProfilePomClass(driver);
		
		//p.clickUser();
		p.clickTataMotor();
		p.clickBuyTataMotor();
	}

}
