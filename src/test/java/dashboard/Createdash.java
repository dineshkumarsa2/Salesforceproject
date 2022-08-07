package dashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createdash {

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
		driver.findElementByXPath("//div[@title='New Dashboard']").click();
		Thread.sleep(5000);

		driver.switchTo().frame(0);
		// driver.findElementByXPath("//input[@class= 'slds-input
		// chromexPathFinder1'][@id= 'dashboardNameInput']").click();
		WebElement name = driver.findElementById("dashboardNameInput");
		name.sendKeys("Salesforce Automation by Dineshkumar");

		driver.findElementByXPath("//footer[@class=\"slds-modal__footer\"]/button[2]").click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(0);
		/*
		 * WebElement element1 =
		 * driver.findElementByXPath("//button[contains(@class,'neutral save')]");
		 * JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 * js1.executeScript("arguments[0].click();", element1);
		 */
		driver.findElementByXPath("//button[contains(@class,'neutral save')]").click();
		driver.switchTo().defaultContent();

	}

}
