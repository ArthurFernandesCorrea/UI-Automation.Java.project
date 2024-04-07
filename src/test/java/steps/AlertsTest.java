package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AlertPage;
import runner.Execute;

public class AlertsTest {

	AlertPage aPage = new AlertPage();

	@Given("that I am on the alerts page")
	public void thatIAmOnTheAlertsPage() {
		Execute.openBrowserAlerts();
	}

	@When("I click on the basic alert button")
	public void iClickOnTheBasicAlertButton() {
		aPage.clickBtnBasicAlert();
	}

	@When("validate basic alert")
	public void validateBasicAlert() {
		aPage.validateBasicAlert();
	}

	@Then("basic alert validation success")
	public void basicAlertValidationSuccess() {
		Execute.closeBrowser();
	}

	@When("I click on the five seconds alert button")
	public void iClickOnTheFiveSecondsAlertButton() throws InterruptedException {
		aPage.clickBtnFiveSecondsAlert();
	}

	@When("validate five seconds alert")
	public void validateFiveSecondsAlert() {
		aPage.validateFiveSecondsAlert();
	}

	@Then("five seconds alert validation success")
	public void fiveSecondsAlertValidationSuccess() {
		Execute.closeBrowser();
	}

	@When("I click on the confirm box alert button")
	public void iClickOnTheConfirmBoxAlertButton() {
		aPage.clickBtnConfirmBoxAlert();
	}

	@When("validate confirm box alert")
	public void validateConfirmBoxAlert() {
		aPage.validateConfirmBoxAlert();
	}

	@Then("confirm box alert validation success")
	public void confirmBoxAlertValidationSuccess() {
		Execute.closeBrowser();
	}

	@When("I click on the prompts box alert button")
	public void iClickOnThePromptsBoxAlertButton() {
		aPage.clickBtnPromptBoxAlert();
	}

	@When("validate prompt box alert")
	public void validatePromptBoxAlert() {
		aPage.validatePromptBoxAlert();
	}

	@Then("prompt box alert validation success")
	public void promptBoxAlertValidationSuccess() {
		Execute.closeBrowser();
	}

}
