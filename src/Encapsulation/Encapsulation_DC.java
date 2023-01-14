package Encapsulation;

public class Encapsulation_DC {
public static void main(String[] args) {
	Encapsulation_SC aa = new Encapsulation_SC();
	aa.setDriver("Firefox");
	aa.setLocator("css");
	aa.setSeconds(5000);
	aa.setVersion(2);
	aa.setWait("Explicitly Wait");
	System.out.println(aa.getDriver());
	System.out.println(aa.getLocator());
	System.out.println(aa.getSeconds());
	System.out.println(aa.getVersion());
	System.out.println(aa.getWait());
}
}
