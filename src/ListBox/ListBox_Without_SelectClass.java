package ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox_Without_SelectClass {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		List <WebElement> city = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println(city.size());
		for(int i =0;i<city.size();i++) {
			String selectedcity = city.get(i).getText();
			System.out.println(selectedcity);
			if(city.get(i).getText().equals("Railway Station, Pune")) {
			city.get(i).click();
			break;
			}
		}
		System.out.println("===============");
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Chennai");
		List<WebElement> dest = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println(dest.size());
		for(int i =0;i<dest.size();i++) {
			String selecteddest = dest.get(i).getText();
			System.out.println(selecteddest);
			if(dest.get(i).getText().equals("Koyambedu, Chennai")) {
				dest.get(i).click();
				break;
			}
		}		
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).sendKeys("30-Dec-2022");
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
