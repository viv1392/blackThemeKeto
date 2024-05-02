package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentBodyType {
	WebDriver driver;
	public BodyTypeUserWants bodyWnats;

	public CurrentBodyType(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='Voluptuous']")
	WebElement eleV;
	@FindBy(xpath="//h3[text()='Average']")
	WebElement eleA;
	@FindBy(xpath="//h3[text()='Plump']")
	WebElement eleP;
	@FindBy(xpath="//h3[text()='Extra']")
	WebElement eleE;
	
	public BodyTypeUserWants volputuous() {
		eleV.click();
	    bodyWnats=new BodyTypeUserWants(driver);
	    return bodyWnats;
	}
	public BodyTypeUserWants average() {
		eleA.click();
		bodyWnats=new BodyTypeUserWants(driver);
	    return bodyWnats;
	}
	public BodyTypeUserWants plump() {
		eleP.click();
		bodyWnats=new BodyTypeUserWants(driver);
	    return bodyWnats;
	}
	public BodyTypeUserWants extra() {
		eleE.click();
		bodyWnats=new BodyTypeUserWants(driver);
	    return bodyWnats;
	}


}
