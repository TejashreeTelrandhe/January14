package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select s1 = new Select (skill);
		s1.selectByVisibleText("Troubleshooting");
			
		WebElement month = driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		Select s3 = new Select (month);
		s3.selectByIndex(5);
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s4 = new Select (day);
		s4.selectByIndex(22);
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s5 = new Select (year);
		s5.selectByValue("1996");
		Thread.sleep(2000);
		driver.quit();
	}

}
