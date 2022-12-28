package scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Addtocart;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;

public class Testcase1 extends StepGroup
{
	@Test
	public void tc1()
	{
		SkillraryLogin i=new SkillraryLogin(driver);
		
		i.gearButton();
		i.demoskillraryapp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		
		driverutilies.switchTabs(driver);
		driverutilies.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		Addtocart ad=new Addtocart(driver);

		driverutilies.doubleClick(driver,ad.getAddbtn());
		ad.addtocartbutton();
		driverutilies.alertpopup(driver);
		
	}

}
