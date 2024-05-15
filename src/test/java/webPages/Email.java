package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class Email extends UtilitiesClass {
	WebDriver driver;
	public PlansPage plans;

	public Email(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="mail-value")
	WebElement eleMail;
	@FindBy(xpath="//span[text()='Next']")
	WebElement eleN;
	
	public PlansPage email(String mail) {
		
		eleMail.sendKeys(mail);
		//scroll(driver,0,600);
		scriptExecutor(driver,eleN);
		//eleN.click();
		plans =new PlansPage(driver);
		return plans;
		
	}

}
