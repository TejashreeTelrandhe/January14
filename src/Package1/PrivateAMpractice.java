package Package1;

public class PrivateAMpractice {
private int age = 25;
	public static void main(String[] args) {
		PrivateAMpractice P1= new PrivateAMpractice();
System.out.println(P1.age);
P1.m2();
	}
private void m2() {
	System.out.println("Private Access Modifier practice");
}
}
