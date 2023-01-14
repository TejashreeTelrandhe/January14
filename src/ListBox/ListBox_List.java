package ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_List {

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
        
        Select select1 = new Select(month);
        List<WebElement> monthlist = select1.getOptions();
        System.out.println("Number of monthlist : "+monthlist.size());
        for(int i=0;i<monthlist.size();i++){
        	String monthvalue = monthlist.get(i).getText();
        	System.out.println(monthvalue);
        	if(monthvalue.equals("May")) {
        	   monthlist.get(i).click();
        		
        	}
        }
        System.out.println("============================================");
        Select select2 = new Select(day);
        List <WebElement> daylist = select2.getOptions();
        System.out.println("Number of daylist : "+daylist.size());
        for(int i =0;i<daylist.size();i++) {
        	String dayvalue = daylist.get(i).getText();
        	System.out.println(dayvalue);
        	if(dayvalue.equals("22")) {
        		daylist.get(i).click();
        	}
        }
        System.out.println("============================================");
        Select select3 = new Select(year);
        List<WebElement> yearlist = select3.getOptions();
        System.out.println("Number of yearlist : "+yearlist.size());
        for(int i =0;i<yearlist.size();i++) {
        	String yearvalue = yearlist.get(i).getText();
        	System.out.println(yearvalue);
        	if(yearvalue.equals("1996")) {
        		yearlist.get(i).click();
        	}
        }
        Thread.sleep(3000);
        driver.quit();
	}

}
