package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Clear_Click_GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr464239");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("apYjEvA");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		System.out.println(driver.findElement(By.xpath("//marquee[@class=\"heading3\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//tr[@class=\"heading3\"]")).getText());
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
        driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("Yavatmal, Maharashtra");
        driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).clear();
        driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("Nagpur, Maharashtra");
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Krishna Mundhada");
        driver.findElement(By.xpath("//input[@name=\"name\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Payal Mundhada");
	}

}
