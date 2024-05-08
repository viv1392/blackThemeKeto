package factoryD;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	static WebDriver driver;

	public static WebDriver intiliseDriver() {
		ChromeOptions option = new ChromeOptions();

		// cloudSauceLab

//          option.setPlatformName("Windows 11");
//    	    option.setBrowserVersion("latest");
//    		Map<String, Object> sauceOptions = new HashMap<>();
//    		sauceOptions.put("username", "oauth-72vivekpandey72-c0d15");
//    		sauceOptions.put("accessKey", "49c8da73-388b-43f5-8cce-44ecc34907c4");
//    		sauceOptions.put("build", "selenium-build-FXIL2");
//    		sauceOptions.put("name", "KetoBlackTheme");
//    		option.setCapability("sauce:options", sauceOptions);
//    		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//    		driver = new RemoteWebDriver(url, option);

		option.addArguments("--incognito");
		//option.addArguments("--headless");
		option.addArguments("--enablenotification");
		driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		return driver;
	}

	public static WebDriver getDriverR() {
		return driver;
	}

}
