package MultipleLinks;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Links_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Number of links = "+links.size( ));
		
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
	}

}
