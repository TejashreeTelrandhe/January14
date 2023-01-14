package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Self_Axes {
//	An axis represents a relationship to the context (current) node, and is used to locate
//	nodes relative to that node on the tree.
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
driver.get("https://demo.guru99.com/v4/index.php");
//   Self : Selects the current node
driver.findElement(By.xpath("//input[@name=\"uid\"]/self::input")).sendKeys("mngr464239");
driver.findElement(By.xpath("//input[@name=\"password\"]/self::input")).sendKeys("apYjEvA");

driver.findElement(By.xpath("//input[@name=\"btnLogin\"]/self::input")).click();

System.out.println(driver.findElement(By.xpath("//td[text()=\"Manger Id : mngr464239\"]/self::td")).getText());

driver.findElement(By.xpath("//a[text()=\"New Customer\"]/self::a")).click();
driver.navigate().refresh();
driver.findElement(By.xpath("//a[text()=\"New Customer\"]/self::a")).click();

driver.findElement(By.xpath("//input[@name=\"name\"]/self::input")).sendKeys("Aditya Birla");

driver.findElement(By.xpath("//input[@value=\"m\"]/self::input")).click();
driver.findElement(By.xpath("//input[@name=\"dob\"]/self::input")).sendKeys("08021999");

driver.findElement(By.xpath("//textarea[@name=\"addr\"]/self::textarea")).sendKeys("Mangal Bhavan ");
driver.findElement(By.xpath("//input[@name=\"city\"]/self::input")).sendKeys("Nagpur");

driver.findElement(By.xpath("//input[@name=\"state\"]/self::input")).sendKeys("MH");
driver.findElement(By.xpath("//input[@name=\"pinno\"]/self::input")).sendKeys("441203");

driver.findElement(By.xpath("//input[@name=\"telephoneno\"]/self::input")).sendKeys("07116232514");
driver.findElement(By.xpath("//input[@name=\"emailid\"]/self::input")).sendKeys("adibirla@gmail.com");

driver.findElement(By.xpath("//input[@name=\"password\"]/self::input")).sendKeys("!@#$%^");
driver.findElement(By.xpath("//input[@name=\"sub\"]/self::input")).click();


Thread.sleep(3000);
driver.quit();
	}

}
