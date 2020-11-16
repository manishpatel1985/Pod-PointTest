package StepDefinitions;

import org.testng.Assert;

import Pages.MainPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PodpointJourney extends  BaseClass {
	
	MainPage mainPage = new MainPage();
	
	public PodpointJourney() {
		super();
	}
	
	@Given("^User navigate to pod-point checkout page$")
	public void user_navigate_to_pod_point_checkout_page()  {
	  setup();
	  verifyTitle("Pod Point");
	  }

	@Given("^User selects Mitsubishi Outlander as a Car Model$")
	public void user_selects_Mitsubishi_Outlander_as_a_Car_Model() throws Throwable {
		MainPage mainPage = new MainPage();
		mainPage.selectCarFields();
	   
	}

	@Given("^User selects not eligible to claim dealership discount$")
	public void user_selects_not_eligible_to_claim_dealership_discount() throws Throwable {
		MainPage mainPage = new MainPage();
	   mainPage.clickOnNotEligibleToClaimDealershipDiscountButton();
	   
	}

	@Then("^User selects connection type as Universal Socket$")
	public void user_selects_connection_type_as_Universal_Socket() throws Throwable {
		MainPage mainPage = new MainPage();
	  mainPage.selectConnectionTypeAsUniversalSocket();
	   
	}

	@Then("^User selects power rating price for seven kilowatt unit$")
	public void user_selects_power_rating_price_for_seven_kilowatt_unit() throws Throwable {
		MainPage mainPage = new MainPage();
	  Assert.assertTrue(mainPage.selectPowerRatingAs7Kw());
	}

	@Then("^User checks six compatible extras are shown and select any compatible extra$")
	public void user_checks_six_compatible_extras_are_shown_and_select_any_compatible_extra() throws Throwable {
		MainPage mainPage = new MainPage();
	   mainPage.checkCompatibleExtrasAreShown();
	  mainPage.selectHolsterAsCompatibleExtra();
	}

	@Then("^User Verify/Ensure total price at the bottom right of the screen matches correctly$")
	public void user_Verify_Ensure_total_price_at_the_bottom_right_of_the_screen_matches_correctly() throws Throwable {
		MainPage mainPage = new MainPage();
		Assert.assertTrue(mainPage.verifyTotalPriceAtTheBottomRightOfTheScreen());
		
	}


}
