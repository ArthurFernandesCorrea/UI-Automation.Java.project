package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ModalPage;
import runner.Execute;

public class ModalTest {
	
	ModalPage mPage = new ModalPage();
	
	@After
	public void closeTest() {
		//Execute.closeBrowser();
	}
	
	@Given("I am on the modal page")
	public void iAmOnTheModalPage() {
		Execute.openBrowserModal();
	}
	

	@When("I click on small modal button")
	public void iClickOnSmallModalButton() {
		mPage.openSmallModal();
	}
	
	@When("validate small modal text")
	public void validateSmallModalText() {
		mPage.validateSmallModal();
	   
	}
	@Then("small modal validation sucess")
	public void smallModalValidationSucess() {
		//Execute.closeBrowser();
	    
	}
	
	@When("I click on large modal button")
	public void iClickOnLargeModalButton() {
		mPage.openLargeModal();
	    
	}
	@When("validate large modal text")
	public void validateLargeModalText() {
		mPage.validateLargeModal();
	    
	}
	@Then("large modal validation sucess")
	public void largeModalValidationSucess() {
		Execute.closeBrowser();
	    
	}

}
