package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.javafaker.Faker;

public class UtilitiesClass {
    public Faker faker= new Faker();

	public void scroll(WebDriver driver,int x,int y) {
		Actions action=new Actions(driver);
		action.scrollByAmount(x, y).build().perform();
	}
	
	public void scrollTillView(WebDriver driver, WebElement ele) {
		Actions action=new Actions(driver);
		action.scrollToElement(ele).build().perform();
	}
	public void scriptExecutor(WebDriver driver,WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
	}
}
