package stepDefnations;

import org.openqa.selenium.WebDriver;

import factoryD.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

public class RegistrationMen extends UtilitiesClass {
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

	@Given("User goes on gender selection page after hitting given url")
	public void registrationWoman() {
		driver = DriverFactory.getDriverR();
		gender = new GenderPage(driver);
	}
	@Then("user selects gender man")
	public void genderMan() {
		currBody=gender.men();
	}
	@And("user selects current body type as extra")
	public void extraBody() {
		bodyType=currBody.extra();
	}
	@Then("user selects target body type as Bulk")
	public void leanBody() {
		achieve=bodyType.bulk();
	}
	@And("user selects what he wants to achieve")
	public void wantsAchieve() {
		zones=achieve.wantTOAchieve();
		
	}
	@Then("user selects his target zone")
	public void targetZone() {
		happy=zones.targetZone();
	}
	@And("user selets his last happy time")
	public void lasHappy() {
		mealTime=happy.moreThanFour();
	}
	@Then("user selects his meal preparation time")
	public void mealTime() {
		meat=mealTime.upTO30Mint();
	}
	@And("usesr selects himself as non veg")
	public void nonVeg() {
		veggies=meat.meat();
	}
	@Then("user selects veggies he eats")
	public void veggies() {
		otherFood=veggies.customVeggies();
	}
	@And("user selects other custom foods for himself")
	public void otherCustomMeal() {
		active=otherFood.customOtherFood();
		
	}
	@Then("user selects how active he is")
	public void active() {
		spendDay=active.exerciseOneTwoWeek();
	}
	@And("user choses how he spends day")
	public void spendDay() {
		pref=spendDay.atWorkPlac();
	}
	@Then("user selects his lifestyle preferences")
	public void lifeStylPreferences() {
		apply=pref.lifePref();
	}
	@And("user selects whats apply for himself")
	public void applies() {
		tall=apply.diseseas();
	}
	@Then("^user enters his height in cm (.+)$")
	public void height(String height) {
		currW=tall.heightINCm(height);
	}
	@And("^user enters his current weight (.+) in Kg$")
	public void currentWeightKg(String currentWeight) {
		tarW=currW.currentWeightkg(currentWeight);
		
	}
	@Then("^user enters his target weight (.+) in Kg$")
	public void targetWeightKg(String trWeight) {
		age=tarW.targetkg(trWeight);
	}
	@And("^user enters his current age (.+)$")
	public void currentAge(String ag) {
		event=age.age(ag);
	}
	@Then("user selects his event")
	public void eventSelection() {
		email=event.familyOccassion();
		
	}
	@And("user enetrs his email")
	public void useerEmail() {
		plans=email.email(faker.internet().emailAddress());
	}
	@Then("user selects his plan")
	public void planSelection() throws InterruptedException {
		plans.choosePlan();
	}


}
