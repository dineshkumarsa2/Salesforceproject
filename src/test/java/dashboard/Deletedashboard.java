package dashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletedashboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@name='username']").sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElementByXPath("//input[@name='pw']").sendKeys("India$321");
		driver.findElementByXPath("//input[@type='submit']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[contains(@class,'slds-r5')]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//button[@type='button'])[51]").click();
		Thread.sleep(5000);
		WebElement element = driver.findElementByXPath("//p[@class='slds-truncate'][contains(.,'Dashboards')]");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(5000);
		driver.findElementByXPath("//input[contains(@size,'28')]").sendKeys("Dineshkumar", Keys.ENTER);
		Thread.sleep(5000);

		WebElement element1 = driver
				.findElementByXPath("//span[@class='highlightSearchText'][contains(.,'Dineshkumar')]/..");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", element1);

		Thread.sleep(10000);

		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@tabindex='0']").click();
		driver.findElementByXPath("//span[text()='Delete']").click();
		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text()='Delete']").click();
		driver.switchTo().defaultContent();
	}

}
