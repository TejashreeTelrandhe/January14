package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		Thread.sleep(3000);

		String winid = driver.getWindowHandle();
		System.out.println(winid);
		driver.findElement(By.xpath("//a[@class=\"action-button\"]")).click();
		Set<String> windowid = driver.getWindowHandles();
		System.out.println(windowid);

		Iterator<String> it = windowid.iterator();
		String id1 = it.next();
		String id2 = it.next();
		System.out.println("Parent Window : " + id1);
		System.out.println("Child Window : " + id2);

		driver.switchTo().window(id1);
		System.out.println(driver.findElement(By.xpath("//h3[text()=\"Someone is impersonating me\"]")).getText());

		driver.switchTo().window(id2);
		System.out.println(driver.findElement(By.xpath("//figcaption[@class=\"oEvHdd\"]")).getText());
	}

}
