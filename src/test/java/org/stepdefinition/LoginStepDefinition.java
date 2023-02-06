package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {

	@When("User have to get title from webpage")
	public void user_have_to_get_title_from_webpage() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		Click(l.getBtnLogin());
		Thread.sleep(5000);
	}

	@Then("User have to navigate to incorrect credential page")
	public void user_have_to_navigate_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("To check browser enters incorrect credential", currentUrl.contains("privacy"));
		System.out.println("Invalid Credentials!!!!!!!!!!!!!!!!");
	
	}

	@Then("User have to navigate to mobile protection page")
	public void userHaveToNavigateToMobileProtectionPage() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("To check browser enters mobile protection page", currentUrl.contains("mobile"));
		System.out.println("successfully entered protected page");
		
	}	
	@When("User have to enter the invalid username and invalid password")
	public void userHaveToEnterTheInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
	    LoginPojo l = new LoginPojo();
	    List<String> li = d.asList();
	    fill(l.getTxtUser(), li.get(0));
	    fill(l.getTxtPass(), li.get(3));
	}

	@When("User have to enter the invalid username and valid password")
	public void userHaveToEnterTheInvalidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
		LoginPojo l = new LoginPojo();
		List<List<String>> li = d.asLists();
		fill(l.getTxtUser(), li.get(0).get(0));
		fill(l.getTxtPass(), li.get(1).get(1));
	}

	@When("User have to enter the valid username and invalid password")
	public void userHaveToEnterTheValidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		LoginPojo l = new LoginPojo();
		Map<String, String> mp = d.asMap(String.class, String.class);
		fill(l.getTxtUser(), mp.get("user"));
		fill(l.getTxtPass(), mp.get("pass"));
	}

	@When("User have to enter the valid username and valid password")
	public void userHaveToEnterTheValidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
		LoginPojo l = new LoginPojo();
		List<Map<String, String>> mp = d.asMaps();
		fill(l.getTxtUser(), mp.get(0).get("user"));
		fill(l.getTxtPass(), mp.get(1).get("pass"));
	}
	
}
