package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class PlansPage extends UtilitiesClass{
	WebDriver driver;

	public PlansPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='CHOOSE YOUR PLAN NOW']")
	WebElement ele;
	
	public void choosePlan() throws InterruptedException {
		scrollTillView(driver,ele);
		Thread.sleep(2000);
		ele.click();
	}

}
