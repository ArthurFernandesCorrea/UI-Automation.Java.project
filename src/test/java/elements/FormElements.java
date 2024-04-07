package elements;

import org.openqa.selenium.By;

public class FormElements {
	
	//Writing fields
	public By firstName = By.id("firstName");
	public By lastName = By.id("lastName");
	public By email = By.id("userEmail");
	public By phoneNumber = By.id("userNumber");
	public By crrentAadress = By.id("currentAddress");
	
	//Gender options
	public By genderMale = By.xpath("//label[normalize-space()=\"Male\"]");
	public By genderFemale = By.xpath("//label[normalize-space()=\"Famale\"]");
	public By genderOther = By.xpath("//label[normalize-space()=\"Other\"]");
	
	//BirthDate field
	public By birthDateField = By.id("dateOfBirthInput");
	public By birthDate = By.xpath("//input[@class='form-control react-datepicker-ignore-onclickoutside']");
	public By btnMonth = By.xpath("//select[@class='react-datepicker__month-select']");
	public By monthJuly = By.xpath("//*[text()='July']");
	public By daySelect = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--013']");
	public By btnYear = By.xpath("//select[@class='react-datepicker__year-select']");
	public By yearSelect = By.xpath("//*[text()='1993']");
	
	// Subjects field
	public By subjectsClick = By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']");
	public By subjectField = By.xpath("//input[@id='subjectsInput']");
	
	
	
	// Hoobies field
	public By hobbieSports = By.xpath("//label[normalize-space()=\"Sports\"]");
	public By hobbieReading = By.xpath("//label[normalize-space()=\"Reading\"]");
	public By hobbieMusic = By.xpath("//label[normalize-space()=\"Music\"]");
	
	// Picture field
	public By chooseFile = By.id("uploadPicture");
	
	// Sate selection
	public By state = By.cssSelector("#state > div > div.css-1wy0on6 > div > svg");
	public By stateField = By.xpath("//input[@id='react-select-3-input']");
	// City selection
	public By city = By.cssSelector("#city > div > div.css-1wy0on6 > div > svg");
	public By cityField = By.xpath("//input[@id='react-select-4-input']");
	
	
	// Submit button
	public By btnSubmit = By.id("submit");
	
	// Student information
		public By studentName = By.xpath("//td[text()='Arthur Correa']");
		public By studentEmail = By.xpath("//td[text()='email@gmail.com']");
		public By gender = By.xpath("//td[text()='Male']");
		public By mobile = By.xpath("//td[text()='0123456789']");
		public By dateOfBirth = By.xpath("//td[text()='13 July,1993']");
		public By subjects = By.xpath("//td[text()='Computer Science']");
		public By hobbies = By.xpath("//td[normalize-space()='Music, Sports']");
		public By picture = By.xpath("//td[text()='Picture.jpg']");
		public By address = By.xpath("//td[text()='Romeu Tortima street, 50']");
		public By stateAndCity = By.xpath("//td[text()='NCR Noida']");
	
	

}
