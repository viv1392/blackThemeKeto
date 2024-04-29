package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatDoYouWantToAchieve {
	WebDriver driver;
	public TargetZones zone;

	public WhatDoYouWantToAchieve(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='Lose weight']")
	WebElement eleLW;
	@FindBy(xpath="//h3[text()='Improve bone health']")
	WebElement eleBH;
	@FindBy(xpath="//h3[text()='Sleep better']")
	WebElement eleSB;
	@FindBy(xpath="//span[text()='Yes, I Got it']")
	WebElement eleGOT;
	
	public TargetZones wantTOAchieve() {
		eleLW.click();
		eleBH.click();
		eleSB.click();
		eleGOT.click();
		zone=new TargetZones(driver);
		return zone;
	}

}
