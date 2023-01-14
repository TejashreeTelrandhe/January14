package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles_1 {

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
		
		Iterator <String> it = windowid.iterator();
		String id1 = it.next();
		String id2 = it.next();
		System.out.println("Parent Window : " + id1);
		System.out.println("Child Window : " + id2);
		
		driver.switchTo().window(id1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(id2);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//span[@class=\"VfPpkd-vQzf8d\"])[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id=\"logo\"]")).isDisplayed());
		
		for(String WIN :windowid) {
			String title = driver.switchTo().window(WIN).getTitle();
			if((title.equals("Create your Google Account"))||(title.equals("Create a Gmail account - Gmail "))){
				driver.close();
			}
		}
		
	}

}
