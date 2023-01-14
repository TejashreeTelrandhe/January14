package Encapsulation;

public class Encapsulation_SC {
private String driver ;
private String locator ;
private int version ;
private String wait ;
private int seconds ;
public String getDriver() {
	return driver;
}

public void setDriver(String driver) {
	this.driver = driver;
}

public String getLocator() {
	return locator;
}

public void setLocator(String locator) {
	this.locator = locator;
}

public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

public String getWait() {
	return wait;
}

public void setWait(String wait) {
	this.wait = wait;
}

public int getSeconds() {
	return seconds;
}

public void setSeconds(int seconds) {
	this.seconds = seconds;
}
	public static void main(String[] args) {
		Encapsulation_SC a1 = new Encapsulation_SC();
		a1.setDriver("Safari");
		a1.setLocator("id");
		a1.setVersion(3);
		a1.setWait("Implicitly Wait");
		a1.setSeconds(15000);
		
		System.out.println("Driver "+a1.getDriver());
		System.out.println("Locator "+a1.getLocator());
		System.out.println("Version "+a1.getVersion());
		System.out.println("Wait "+a1.getWait());
		System.out.println("Seconds "+a1.getSeconds());
	}

}
