package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Array_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://twitter.com/i/flow/signup");	
		driver.findElement(By.xpath("//span[text()=\"Sign up with phone or email\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Abhishek Mudholkar");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("8888868511");
        WebElement month = driver.findElement(By.xpath("//select[@id=\"SELECTOR_1\"]"));
        WebElement day = driver.findElement(By.xpath("//select[@id=\"SELECTOR_2\"]"));
        WebElement year = driver.findElement(By.xpath("//select[@id=\"SELECTOR_3\"]"));
//        dob(month,"5");
//        dob(day,"22");
//        dob(year,"1996");
        String date= "5/22/1996";
        String ss []= date.split("/");
//      ss [0]= 5;
//      ss [1]= 22;
//      ss [2]= 1996;
        dob(month,ss[0]);
        dob(day,ss[1]);
        dob(year,ss[2]);
        Thread.sleep(3000);
        driver.quit();
}
	public static void dob(WebElement element, String value) {
		Select s1 = new Select (element);
		s1.selectByValue(value);
	}
}