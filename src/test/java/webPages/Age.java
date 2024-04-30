package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Age {
	WebDriver driver;
	public Event event;

	public Age(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='number']")
	WebElement eleAg;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public Event age(String age) {
		eleAg.sendKeys(age);
		eleN.click();
		event=new Event(driver);
		return event;
		
	}

}
