package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilitiesClass;

public class WhatDoYouWantToAchieve extends UtilitiesClass {
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
	@FindBy(xpath="//h3[text()='Reduce cholesterol level']")
	WebElement eleCl;
	@FindBy(xpath="//h3[text()='Increase life expectancy']")
	WebElement eleLE;
	@FindBy(xpath="//span[text()='Yes, I Got it']")
	WebElement eleGOT;
	
	public TargetZones wantTOAchieve() {
		scriptExecutor(driver,eleLE);
		//eleLE.click();
		scriptExecutor(driver,eleLW);
		//eleLW.click();
		scriptExecutor(driver,eleBH);
		//eleBH.click();
		scriptExecutor(driver,eleCl);
		//eleCl.click();
		scriptExecutor(driver,eleSB);
		//eleSB.click();
		scriptExecutor(driver,eleGOT);
		//eleGOT.click();
		zone=new TargetZones(driver);
		return zone;
	}

}
