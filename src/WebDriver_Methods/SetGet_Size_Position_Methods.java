package WebDriver_Methods;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetGet_Size_Position_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.zerozilla.com/");
		
		Dimension d = new Dimension(400,500);
		driver.manage().window().setSize(d);
		
		System.out.println("Size :"+driver.manage().window().getSize());
		
		Point p = new Point(100,560);
		driver.manage().window().setPosition(p);
		
		System.out.println("Position :"+driver.manage().window().getPosition());
		
		Thread.sleep(3000);
		 
		driver.close();
	}

}
