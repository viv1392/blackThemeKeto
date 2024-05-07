package stepDefnations;

import org.openqa.selenium.WebDriver;

import factoryD.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
import webPages.PlansPage;
import webPages.TargetWeight;
import webPages.TargetZones;
import webPages.Veggies;
import webPages.WhatDoYouWantToAchieve;

public class RegistrationWomanCmFeetInch extends UtilitiesClass {
	WebDriver driver;
	GenderPage gender;
	CurrentBodyType currBody;
	BodyTypeUserWants bodyType;
	WhatDoYouWantToAchieve achieve;
	TargetZones zones;
	LastHappyWithYourWeight happy;
	MealPreparationTime mealTime;
	Meat meat;
	Veggies veggies;
	OtherFoodItems otherFood;
	HowActiveAreYou active;
	HowYouSpendYourDay spendDay;
	LifestylePreferences pref;
	DoesAnyOfTheFollowingApplyForYou apply;
	HowTallAreYou tall;
	CurrentWeight currW;
	TargetWeight tarW;
	Age age;
	Event event;
	Email email;
	PlansPage plans;

	@Given("User lands on Gender Page after hitting url")
	public void registrationWoman() {
		driver = DriverFactory.getDriverR();
		gender = new GenderPage(driver);
	}

	@Then("user selects gender female")
	public void genderWomen() {
		currBody = gender.woman();
	}

	@And("user selects current body type as volpotuous")
	public void userCurrBodyVol() {
		bodyType = currBody.volputuous();
	}

	@Then("user selects target body type as fit")
	public void targetBodyFit() {
		achieve = bodyType.fit();
	}

	@And("user selects what she wants to achieve")
	public void userWantsToAchieve() {
		zones = achieve.wantTOAchieve();
	}

	@Then("user selects target zones")
	public void targetZones() {
		happy = zones.targetZone();
	}

	@And("user selcts last happy time zone")
	public void lastHappy() {
		mealTime = happy.moreThanFour();
	}

	@Then("user selects meal preparation time")
	public void mealPrepartaionTime() {
		meat = mealTime.upTOOne();
	}

	@And("user on meat page selects diet type as non veg")
	public void meatPage() {
		veggies = meat.meat();
	}

	@Then("user selects veggis as eat all")
	public void allVeggies() {
		otherFood = veggies.allVeggies();
	}

	@And("user selects all items in other food items")
	public void allOtherFood() {
		active = otherFood.allOtherItems();
	}

	@Then("user selects activity level")
	public void activityLevel() {
		spendDay = active.exerciseOneTwoWeek();
	}

	@And("user selects how he spends days")
	public void spendDays() {
		pref = spendDay.atWorkPlac();
	}

	@Then("user selects life style preferences")
	public void lifstylePref() {
		apply = pref.nonePref();
	}

	@And("user delects which diseases applies on her")
	public void diseseApply() {
		tall = apply.diseaseApplicable();
	}

	@Then("^user selects how tall she is (.+)$")
	public void height(String cm) {
		currW = tall.heightINCm(cm);
	}

	@And("user selects curr weight in lbs")
	public void currWeight() {
		tarW = currW.currentWeightLb("210");
	}

	@Then("user selects target weight in lbs")
	public void targetWeight() {
		age = tarW.targetWlb("183");
	}

	@And("user selects her age")
	public void age() {
		event = age.age("32");
	}

	@Then("user selects as no event")
	public void noEvent() {
		email = event.event();
	}

	@And("user enters her email")
	public void email() {
		plans = email.email(faker.internet().emailAddress());
	}

	@Then("user on plan pages selects plan")
	public void plans() throws InterruptedException {
		plans.choosePlan();
	}

	@And("user selects current body type as average")
	public void averageBdyType() {
		bodyType = currBody.average();
	}

	@Then("user selects target body type as bulk")
	public void tarBodyTypeLean() {
		achieve = bodyType.bulk();
	}

	@And("user on meat page selects diet type as vegetarian")
	public void vegetarian() {
		veggies = meat.vegetarian();
	}

	@When("^user selects height in Feet and inches (.+) and (.+)$")
	public void heightInFeetInch(String feet, String inch) {
		currW = tall.heightINFt(feet, inch);
	}

	@And("user on meat page selects diet type as vegan herself")
	public void vegan() {
		veggies = meat.vegan();
	}

	@Then("user selects in static manner height")
	public void user_selects_in_static_manner_height() {
		currW = tall.heightINCm("185");

	}

	@Then("^user selects current weight in lbs in flexible manner (.+)$")
	public void user_selects_current_weight_in_lbs_in_flexible_manner(String lb) {
		tarW = currW.currentWeightLb(lb);
	}

	@Then("user selects target weight in lbs instatic manner")
	public void targetWeightLbStatic() {
		age = tarW.targetWlb("170");
	}

	@And("user enters curr weight in lbs in static manner")
	public void currentWeightStatic() {
		tarW = currW.currentWeightLb("210");
	}

	@Then("^user enters target weight in lbs in flexible manner (.+)$")
	public void targetWeightFlexible(String lbs) {
		age = tarW.targetWlb(lbs);
	}

	@And("^user selects her age in flexible mannaer (.+)$")
	public void felxibleAge(String yrs) {
		event = age.age(yrs);

	}

	@And("^user enters current weight in kg in flexible manner (.+)$")
	public void felxibleCurrWeightKg(String kg) {
		tarW = currW.currentWeightkg(kg);
	}

	@Then("user enters targeted weight in kg in static manner")
	public void targetWeightstaticKg() {
		age = tarW.targetkg("075");
	}
	@And("user selects curr weight in kg in static manner")
	public void currWeightStaticKg() {
		tarW = currW.currentWeightkg("099");
	}
	@Then("^user selects target weight in kg in flexible manner (.+)$")
	public void felxibleTargetWeightKg(String kg) {
		age = tarW.targetkg(kg);
		
	}

}
