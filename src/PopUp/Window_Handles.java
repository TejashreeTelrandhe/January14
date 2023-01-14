package PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		String Winid = driver.getWindowHandle();
		System.out.println(Winid);
		System.out.println();
		
		driver.findElement(By.xpath("//a[@class=\"action-button\"]")).click();

		Set<String> pagesid = driver.getWindowHandles();
		System.out.println(pagesid);
		System.out.println();
		
		Iterator<String> it = pagesid.iterator();
		String id1 = it.next();
		String id2 = it.next();
		System.out.println(id1);
		System.out.println(id2);
		System.out.println();

		ArrayList<String> arr = new ArrayList(pagesid);
		String windowid1 = arr.get(0);
		String windowid2 = arr.get(1);
		System.out.println(windowid1);
		System.out.println(windowid2);
	}

}
