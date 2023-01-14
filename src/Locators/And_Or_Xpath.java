package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class And_Or_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println("And operator xpath");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\" and @ id=\"firstName\"]")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\" and @ class=\" mr-sm-2 form-control\"]"))
				.sendKeys("Sambhare");

		driver.findElement(By.xpath("//input[@type=\"text\" and @ id=\"userEmail\"]")).sendKeys("kiran99@gmail.com");
		WebElement gender = driver.findElement(By.xpath("//input[@id=\"gender-radio-2\" and @ value=\"Female\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(gender).click().perform();

		driver.findElement(By.xpath("//input[@id=\"userNumber\" and @ placeholder=\"Mobile Number\"]"))
				.sendKeys("9326708637");
		WebElement subject = driver
				.findElement(By.xpath("//div[@class=\" css-2b097c-container\" and @ id=\"subjectsContainer\"]"));
//        driver.findElement(By.xpath("//div[@class=\"subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3\"]"))
//        .sendKeys("CS");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value='Computer science'", subject);
		WebElement hobbies = driver.findElement(By.xpath("//input[@type=\"checkbox\" and @id=\"hobbies-checkbox-2\"]"));
		act.moveToElement(hobbies).click().perform();
		driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\" and @ id=\"currentAddress\"]"))
				.sendKeys("Mahal, Nagpur");

		System.out.println("Or operator xpath");
		driver.findElement(By.xpath("//div[@class=\"header-text\" or @class=\"pr-1\"]")).click();
		driver.findElement(By.xpath("//li[@class=\"btn btn-light\" or @id=\"item-0\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\" or @id=\"userName\"]")).sendKeys("Kishor");
		driver.findElement(By.xpath("//input[@type=\"email\" or @id=\"userEmail\"]")).sendKeys("Sambhare");
		driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\" or @id=\"currentAddress\"]")).sendKeys("Amravati");
		driver.findElement(By.xpath("//textarea[@class=\"col-md-9 col-sm-12\" or @id=\"permanentAddress\"]")).sendKeys("Nagpur, Maharashtra");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
