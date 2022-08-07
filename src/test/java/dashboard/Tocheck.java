package dashboard;
 	

	  

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Tocheck {

		 
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver= new ChromeDriver(options);
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.id("password")).sendKeys("India$321");
			driver.findElement(By.id("Login")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[51]")).click();
			WebElement element = driver.findElement(By.xpath("//p[text()='Sales']"));
		    JavascriptExecutor js= (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].click();",element);
		    Thread.sleep(3000);
		    WebElement acc_Field = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
		    js.executeScript("arguments[0].click();", acc_Field);
		    //driver.findElement(By.xpath("//a[@title='Accounts'])")).click();
		    //driver.findElement(By.xpath("//span[text()='Accounts']")).click();
			//driver.findElement(By.xpath("//div[@style='width:323px']/a")).click();
			 Thread.sleep(3000);
		}

	}

