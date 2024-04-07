package pages;

import elements.AlertElements;
import methods.Methods;
import utilities.StringData;

public class AlertPage {
	
	Methods method = new Methods();
	AlertElements al = new AlertElements();
	StringData sd = new StringData();
	
	public void clickBtnBasicAlert() {
		method.click(al.btnBasicAlert, "Click on basic alert button");
	}
	
	public void validateBasicAlert() {
		method.validateAlert("You clicked a button", "Validate basic alert");
	}
	
	public void clickBtnFiveSecondsAlert() throws InterruptedException{
		method.click(al.btn5SecondsAlert, "Click on 5 seconds alert button");
		Thread.sleep(5001);
	}
	
	public void validateFiveSecondsAlert() {
		method.validateAlert("This alert appeared after 5 seconds", "Validate five seconds alert");
	}
	
	public void clickBtnConfirmBoxAlert() {
		method.click(al.btnConfirmBoxAlert, "Click on confirm box alert button");
	}
	
	public void validateConfirmBoxAlert() {
		method.validateAlert("Do you confirm action?", "Validate confirm question");
		method.alertAccept("Confirm action Ok.");
		method.textValidation(al.confirmResult, "You selected " + "Ok", "Validate confirm box ok");
	}
	
	public void clickBtnPromptBoxAlert() {
		method.click(al.btnPromptBoxAlert, "Click on prompt box alert button");
	}
	
	public void validatePromptBoxAlert() {
		method.validateAlert("Please enter your name", "Validate prompt alert");
		method.fillAlertPrompt(sd.textPrompt, "Writing on prompt.");
		method.alertAccept("Confirm action Ok.");
		method.textValidation(al.promptResult, "You entered " + "Test Name", "Validate prompt box alert");
	}
	

}
