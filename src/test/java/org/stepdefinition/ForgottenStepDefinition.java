package org.stepdefinition;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.ForgetPojo;
import io.cucumber.java.en.*;

public class ForgottenStepDefinition extends BaseClass {
	@When("User should click the forgotten password")
	public void user_should_click_the_forgotten_password() throws InterruptedException {
		ForgetPojo f = new ForgetPojo();
		Click(f.getForgotPass());
	}

	@When("User should enter invalid mobile number")
	public void user_should_enter_invalid_mobile_number() {
		ForgetPojo f = new ForgetPojo();
		fill(f.getTxtEntNum(), "1234567890");
	}

	@When("User should submit the moblie number")
	public void user_should_submit_the_moblie_number() throws InterruptedException {
		ForgetPojo f = new ForgetPojo();
		Click(f.getBtnClkSubmit());
	}

	@Then("User should navigate to otp page")
	public void user_should_navigate_to_otp_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("To check Browser enters recovers page", currentUrl.contains("recover"));
		System.out.println("Browser navigates to reover page");
	}

}
