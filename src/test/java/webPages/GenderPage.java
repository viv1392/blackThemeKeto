package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenderPage {
	WebDriver driver;
	public CurrentBodyType currBody;

	public GenderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='Man']")
	WebElement eleM;
	@FindBy(xpath="//h3[text()='Woman']")
	WebElement eleW;
	
	public CurrentBodyType men() {
		eleM.click();
		currBody=new CurrentBodyType(driver);
		return currBody;
	}
	public CurrentBodyType woman() {
		eleW.click();
		currBody=new CurrentBodyType(driver);
		return currBody;
	}

}
