package pages;

import elements.FormElements;
import methods.Methods;
import utilities.StringData;

public class FormPage {
	
	Methods method = new Methods();
	FormElements el = new FormElements();
	StringData sd = new StringData();
	
	public void preenhcerFormulario() {
		method.write(el.firstName, sd.name, "Writing name");
		method.write(el.lastName, sd.lastName, "Writing last name");
		method.write(el.email, sd.studentEmail	, "Write email");
		method.click(el.genderMale, "Select gender");
		method.write(el.phoneNumber, sd.phoneNumber, "Write phone number");
		
		//Date of Birth field requires 6 methods
		method.click(el.birthDateField, "Click on birth date field");
		method.click(el.btnMonth, "Click on month button");
		method.click(el.monthJuly, "Select month");
		method.click(el.btnYear, "Click on year button");
		method.click(el.yearSelect, "Select year");
		method.click(el.daySelect, "Select day");
		
		//Subject field requires 3 methods
		method.click(el.subjectsClick, "Click subjectfild");
		method.write(el.subjectField, sd.subject, "Inform subjects");
		method.pressEnter(el.subjectField, "Pressing enter key");
		
		//Hobbie fields can select multiple options
		method.click(el.hobbieMusic, "Select music");
		method.click(el.hobbieSports, "Select sports");
		
		method.uploadFile(new String[] {sd.picturePath}, el.chooseFile, "Select picture");
		
		method.write(el.crrentAadress, sd.adress, "Write adress");
		
		//State field requires 2 methods
		method.write(el.stateField, sd.state, "Select state");
		method.pressEnter(el.stateField, "Pressing enter key");
		
		//City field requires 2 methods
		method.write(el.cityField, sd.city, "Select city");
		method.pressEnter(el.cityField, "Pressing enter key");
		
		}
	
	
	public void clicarSubmit() {
		method.submit(el.btnSubmit, "Click on submit button");
	}
	
	public void validateInformation() {
		method.textValidation(el.studentName, sd.studentName, "Validate student name");
		method.textValidation(el.studentEmail, sd.studentEmail, "Validate student email");
		method.textValidation(el.gender, sd.gender, "Validate student gender");
		method.textValidation(el.mobile, sd.phoneNumber, "validate student phone number");
		method.textValidation(el.dateOfBirth, sd.birthDate, "Validate birthdate");
		method.textValidation(el.subjects, sd.subject, "Validate subject");
		method.textValidation(el.hobbies, sd.hobbies, "Validate hobbies");
		method.textValidation(el.picture, sd.picture, "Validate picture");
		method.textValidation(el.address, sd.adress, "Validate adress");
		method.textValidation(el.stateAndCity, sd.stateAndCity, "Validate state and city");
		
	}

}
