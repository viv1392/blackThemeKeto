package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Event {
	WebDriver driver;
	public Email email;

	public Event(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='No']")
	WebElement eleNo;
	@FindBy(xpath="//h3[text()='Family occasion']")
	WebElement eleFO;
	
	public Email event() {
		eleNo.click();
		email=new Email(driver);
		return email;
	}
	public Email familyOccassion() {
		eleFO.click();
		email=new Email(driver);
		return email;
	}

}
