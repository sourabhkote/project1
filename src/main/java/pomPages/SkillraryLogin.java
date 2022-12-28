package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin
{
	@FindBy (xpath="//a[text()=' GEARS ']")
	private WebElement gerastab;
	
	@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy (name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement gobtn;
	
	public SkillraryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	public void gearButton()
	{
		gerastab.click();
	}
	public void demoskillraryapp()
	{
		demoapp.click();
	}
	public void searchtextbox(String course)
	{
		searchtb.sendKeys(course);
	}
	public void searchbutton()
	{
		gobtn.click();
	}

}
