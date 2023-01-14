package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Displayed_Enabled_Selected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/manager/addcustomerpage.php");
		System.out.println(driver.findElement(By.xpath("//input[@name=\"name\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@name=\"dob\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@name=\"city\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@name=\"state\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@name=\"pinno\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@value=\"f\"]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value=\"m\"]")).isSelected());
		driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value=\"f\"]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@name=\"accountno\"]")).isDisplayed());
	}

}
