package methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import drivers.Drivers;

public class Methods extends Drivers {

	public void write(By element, String text, String step) {
		driver.findElement(element).sendKeys(text);

	}

	public void click(By element, String step) {
		driver.findElement(element).click();

	}

	public void pressEnter(By element, String step) {
		WebElement inputElement = driver.findElement(element);
		inputElement.sendKeys(Keys.ENTER);
	}

	public void uploadFile(String[] filePath, By fileField, String step) {
		WebElement inputElement = driver.findElement(fileField);
		inputElement.sendKeys(filePath);
	}

	public void textValidation(By element, String expectedText, String step) {
		assertTrue(driver.findElement(element).getText().contains(expectedText));
	}

	public void submit(By element, String step) {
		driver.findElement(element).submit();
	}

	public void validateAlert(String alert, String step) {
		String alertText = driver.switchTo().alert().getText();
		assertEquals(alert, alertText);
	}

	public void alertAccept(String step) {
		driver.switchTo().alert().accept();
	}

	public void alertDismiss(String step) {
		driver.switchTo().alert().dismiss();
	}

	public void fillAlertPrompt(String character, String step) {
		driver.switchTo().alert().sendKeys(character);

	}
}
