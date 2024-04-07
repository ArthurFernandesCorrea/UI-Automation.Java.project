package runner;



import org.junit.runner.RunWith;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources",
			tags = "@Regressivos",
			glue = "steps",
			dryRun = false,
			monochrome = true,
			snippets = SnippetType.CAMELCASE,
			plugin = {"pretty","html:target/reports-cucumber.html"}
					
		)

	public class Execute extends Drivers {

		public static void openBrowserForm() {
			String url = "https://demoqa.com/automation-practice-form";
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Actions actions = new Actions(driver);
			actions.scrollByAmount(0, 500).perform();
			
		}
		
		public static void openBrowserAlerts() {
			String url = "https://demoqa.com/alerts";
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Actions actions = new Actions(driver);
			actions.scrollByAmount(0, 500).perform();
			
		}
		
		public static void openBrowserModal() {
			String url = "https://demoqa.com/modal-dialogs";
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Actions actions = new Actions(driver);
			actions.scrollByAmount(0, 500).perform();
			
		}
		
		
		
		public static void closeBrowser() {
			driver.quit();
		}

}
