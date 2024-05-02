package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilitiesClass {

	public void scroll(WebDriver driver,int x,int y) {
		Actions action=new Actions(driver);
		action.scrollByAmount(x, y).build().perform();
	}
	
	public void scrollTillView(WebDriver driver, WebElement ele) {
		Actions action=new Actions(driver);
		action.scrollToElement(ele).build().perform();
	}
}
