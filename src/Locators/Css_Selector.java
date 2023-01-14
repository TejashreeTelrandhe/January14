package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demoqa.com/automation-practice-form");
//      Tagname and Id attribute  
//		driver.findElement(By.cssSelector("Tag#Value of Id attribute"));
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Tejashree");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Telrandhe");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("tejashree.23gmail.com");
		WebElement gender = driver.findElement(By.cssSelector("input#gender-radio-2"));
//		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("input#gender-radio-2"))).click();
		Actions act = new Actions(driver);
		act.moveToElement(gender).click().perform();

//		Tagname and Class
//		driver.findElement(By.cssSelector("Tag.Value of Class attribute"));
		driver.findElement(By.cssSelector("div.header-text")).click();
		driver.findElement(By.cssSelector("span.text")).click();
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control")).sendKeys("Tejashree Telrandhe");
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Nagpur");
		WebElement submit = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", submit);
		WebElement text = driver.findElement(By.cssSelector("div.mt-4.row"));
		System.out.println(new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(text)).getText());

//	    Tagname and Attribute
//	    driver.findElement(By.cssSelector("Tag[Attribute=value]"));
		driver.findElement(By.cssSelector("input[id=userEmail]")).sendKeys("tejashreetelrandhe1999@gmail.com");
		driver.findElement(By.cssSelector("textarea[id=permanentAddress]")).sendKeys("Mahal, Nagpur");
		WebElement submit1 = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", submit1);
		WebElement text1 = driver.findElement(By.cssSelector("div.mt-4.row"));
		System.out.println(new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(text1)).getText());

//		Tagname, Class and Attribute
//	    driver.findElement(By.cssSelector("tag.class[attribute=value]"));
//		driver.findElement(By.cssSelector("//div[contains(text(),'Forms')]")).click();
//		driver.findElement(By.cssSelector("li.btn.btn-light.active[id=\"item-0\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control[placeholder=\"First Name\"]")).sendKeys("Ajay");
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control[placeholder=\"Last Name\"]"))
				.sendKeys("Kulkarni");
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control[id=\"userEmail\"]"))
				.sendKeys("AjayKulkarni@gmail.com");
		driver.findElement(By.cssSelector("label.custom-control-label[class=\"custom-control-label\"]")).click();
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control[id=\"userNumber\"]")).sendKeys("7262888169");
		
//	    Sub-String Matches
//	    driver.findElement(By.cssSelector("Tag[attribute^=prefix of the string]"));
		driver.findElement(By.cssSelector("input[id^=dateOfBirth]")).clear();
		driver.findElement(By.cssSelector("input[id^=dateOfBirth]")).sendKeys("25 May 2022");
		WebElement hobbies = driver.findElement(By.cssSelector("label[for^=hobbies-checkbox-2]"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", hobbies);
		driver.findElement(By.cssSelector("textarea[id^=currentAddress]")).sendKeys("Amravati");
		driver.findElement(By.cssSelector("button[id^=submit]")).click();
		Thread.sleep(3000);
		WebElement msg = driver.findElement(By.cssSelector("div[id^=example-modal-sizes-title-lg]"));
		System.out.println(msg.getText());
		Thread.sleep(3000);
		System.out.println("CSS Selector practicesd");
		driver.close();
	}

}
