package stepDefnations;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.UtilitiesClass;
import webPages.Age;
import webPages.BodyTypeUserWants;
import webPages.CurrentBodyType;
import webPages.CurrentWeight;
import webPages.DoesAnyOfTheFollowingApplyForYou;
import webPages.Email;
import webPages.Event;
import webPages.GenderPage;
import webPages.HowActiveAreYou;
import webPages.HowTallAreYou;
import webPages.HowYouSpendYourDay;
import webPages.LastHappyWithYourWeight;
import webPages.LifestylePreferences;
import webPages.MealPreparationTime;
import webPages.Meat;
import webPages.OtherFoodItems;
import webPages.TargetWeight;
import webPages.TargetZones;
import webPages.Veggies;
import webPages.WhatDoYouWantToAchieve;

public class StepsD extends UtilitiesClass {
	//public RemoteWebDriver driver;
	public WebDriver driver;
	public GenderPage gender;
	public CurrentBodyType currBody;
	public BodyTypeUserWants bodyWants;
	public WhatDoYouWantToAchieve achieve;
	public TargetZones zone;
	public LastHappyWithYourWeight lastHappy;
	public MealPreparationTime mealTime;
	public Meat meat;
	public Veggies veggies;
	public OtherFoodItems otherFood;
	public HowActiveAreYou active;
	public HowYouSpendYourDay day;
	public LifestylePreferences preferences;
	public DoesAnyOfTheFollowingApplyForYou apply;
	public HowTallAreYou tall;
	public CurrentWeight currWlb;
	public TargetWeight trrWlb;
	public Age age;
	public Event event;
    public Email email;
	
	@Before
	public void browserSetUp() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		
		
	// cloudSauceLab
		
//	    option.setPlatformName("Windows 11");
//	    option.setBrowserVersion("latest");
//		Map<String, Object> sauceOptions = new HashMap<>();
//		sauceOptions.put("username", "oauth-72vivekpandey72-c0d15");
//		sauceOptions.put("accessKey", "49c8da73-388b-43f5-8cce-44ecc34907c4");
//		sauceOptions.put("build", "selenium-build-FXIL2");
//		sauceOptions.put("name", "KetoBlackTheme");
//		option.setCapability("sauce:options", sauceOptions);
//		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//		driver = new RemoteWebDriver(url, option);
		
		
		
		option.addArguments("--incognito");
		//option.addArguments("--headless");
		option.addArguments("--enablenotification");
		driver=new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	@After
	public void browserTearDown() {
		//driver.quit();
	}
	
	
	@Given("User lands on gender page after hitting landing url")
	public void User_lands_on_gender_page_after_hitting_landing_url() {
		driver.get("https://gl.ketobalanced.com/usa");
		gender=new GenderPage(driver);
	}
	@Then("User selects user gender as Women")
	public void genderWomen() {
		currBody=gender.woman();
	}
	@And("User selects user body as volputuous")
	public void current_Body_Type() {
		bodyWants=currBody.volputuous();
	}
	@Then("User selects body type user wants")
	public void bodyType_user_wants() {
		achieve=bodyWants.fit();
		
	}
	@And("User choose what he wants achieve")
	public void user_wants_achieve() {
		
		zone=achieve.wantTOAchieve();
	}
	@Then("User choose target zone")
	public void target_Zone() {
		lastHappy=zone.targetZone();
	}
	@And("User choses when user were last happy")
	public void user_last_happy() {
		mealTime=lastHappy.lessThanTwoYear();
	}
	@Then("User Selects meal preparation time")
	public void mealTime() {
		meat=mealTime.upTOOne();
		
	}
	@When("User selects diet type meat")
	public void meat() {
		veggies=meat.meat();
		
	}
	@And("User choses all veggies to eat")
		public void allVeggies() {
		otherFood=veggies.allVeggies();
	}
	@Then("User choses All other foods to eat")
	public void allOtherFood() {
		active=otherFood.allOtherItems();
	}
	@When("User selects activity one two times a week")
	public void exeOneTwoTimes() {
		day=active.exerciseOneTwoWeek();
	}
	@Then("User selects his day how it goes")
	public void usersDay() {
		preferences=day.atWorkPlac();
	}
	@And("User selects lifestyle preferences")
	public void lifstylePreferneces() {
		apply=preferences.nonePref();
	}
	@When("User selects None diseases")
	public void disesesApply() {
		tall=apply.diseaseApplicable();
			
	}
	@Then("User selects height in Cm")
	public void heightCm() {
		currWlb=tall.heightINCm("176");
		
	}
	@And("User eneters current weight in lbs")
	public void currentWeightLbs() {
		trrWlb=currWlb.currentWeightLb("210");
		
	}
	@Then("User eneters target weight in lbs")
	public void targetWeight() {
		age=trrWlb.targetWlb("182");
		
	}
	@And("User enters valid age")
	public void age() {
		event=age.age("38");
		
	}
	@Then("User selects event as NO")
	public void event() {
		email=event.event();
	}
	@And("User enters valid email")
	public void email() {
		email.email("vpp@yopmail.com");
	}


}
