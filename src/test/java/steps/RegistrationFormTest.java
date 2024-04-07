package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormPage;
import runner.Execute;

public class RegistrationFormTest {

	FormPage fPage = new FormPage();

	@After
	public void closeTest() {
		Execute.closeBrowser();
	}

	@Given("that I am on the form page")
	public void thatIAmOnTheFormPage() {
		Execute.openBrowserForm();
	}

	@When("fill out the form with valid data")
	public void fillOutTheFormWithValidData() {
		fPage.preenhcerFormulario();
	}

	@When("click on submit")
	public void clickOnSubmit() {
		fPage.clicarSubmit();
	}

	@Then("then a filled out form will be displayed")
	public void thenAFilledOutFormWillBeDisplayed() {
		fPage.validateInformation();
	}

}
