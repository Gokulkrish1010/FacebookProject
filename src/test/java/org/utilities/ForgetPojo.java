package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPojo extends BaseClass {
	public ForgetPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPass;

	@FindBy(id = "identify_email")
	private WebElement txtEntNum;

	@FindBy(id = "did_submit")
	private WebElement btnClkSubmit;

	public WebElement getForgotPass() {
		return forgotPass;
	}

	public WebElement getTxtEntNum() {
		return txtEntNum;
	}

	public WebElement getBtnClkSubmit() {
		return btnClkSubmit;
	}

}
