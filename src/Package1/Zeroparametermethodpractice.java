package Package1;

public class Zeroparametermethodpractice {
public static void main(String[] args) {
	Zeroparametermethodpractice N = new Zeroparametermethodpractice();
	N.m1();
	m2();
}
public void m1() {
	System.out.println("Non static method without parameter");
}
public static void m2() {
	System.out.println("Static method without parameter");
}
}
