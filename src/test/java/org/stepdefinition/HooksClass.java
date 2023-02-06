package org.stepdefinition;

import java.io.IOException;

import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before(order=1)
	public void beforeScenario() {
		launchBrowser();
	}
	@Before(order=2)
	public void bef() {
		url("https://en-gb.facebook.com/");
	}
	@Before(order=3)
	public void befMax() {
		toMaximize();
	}
	@After(order=2)
	public void screenshot(Scenario s) throws IOException {
		String name = s.getName();
		String fileName = name.replace(" ", "_");
		screenshot(fileName);
	}
	@After(order=1)
	public void aftQuit() {
		toQuit();
	}
}
