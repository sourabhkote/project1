package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Selenium;
import pomPages.SkillraryLogin;
import pomPages.Wishlist;

public class Testcase3 extends StepGroup
{
	@Test
	public void tc3() throws IOException,InterruptedException 
	{
		SkillraryLogin s=new SkillraryLogin(driver);
		s.searchtextbox (pdata.getPropertydata("coursename"));
		s.searchbutton();
		
		Selenium se=new Selenium(driver);
		se.corejavaselenium();
		
		Wishlist w=new Wishlist(driver);
		w.closepopup();
		driverutilies.switchframe(driver);
		
		w.playbtn();
		Thread.sleep(10000);
		w.pausebtn();
		driverutilies.switchbackframe(driver);
		w.wishlist();
		
		
	}
	

}
