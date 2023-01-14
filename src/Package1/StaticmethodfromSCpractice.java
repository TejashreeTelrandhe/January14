package Package1;

public class StaticmethodfromSCpractice {

	public static void main(String[] args) {
		System.out.println("Main method started");
m1();// calling by method name
m2();// calling by method name
StaticmethodfromSCpractice.m3();// calling by classname.method name
StaticmethodfromSCpractice.m4();// calling by classname.method name
System.out.println("Main method ended");
	}
public static void m1() {
	System.out.println("Static Method same class m1");
}
public static void m2() {
	System.out.println("Static Method same class m2");
}
public static void m3() {
	System.out.println("Static Method same class m3");
}
public static void m4() {
	System.out.println("Static Method same class m4");
}
}
