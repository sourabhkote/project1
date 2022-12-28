package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;
import pomPages.Testing;

public class Testcase2  extends StepGroup
{
@Test
public void tc2() throws IOException
{
	SkillraryLogin s=new SkillraryLogin(driver);
	s.gearButton();
	s.demoskillraryapp();
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutilies.switchTabs(driver);
	driverutilies.dropdown(sd.getCoursetab(),pdata.getPropertydata("coursedd"));
	
	Testing t= new Testing (driver);
	driverutilies.draganddrop(driver,t.getSelenium(),t.getCart() );
	Point loc=t.getFacebook().getLocation();
	int x=loc.getX();
	int y=loc.getY();
	
	driverutilies.scrollBar(driver, x, y);
	t.facebookicon();
	
	
}
}
