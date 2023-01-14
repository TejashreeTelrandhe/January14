package Package1;

public class Withparametermethodpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withparametermethodpractice W = new Withparametermethodpractice();
		W.m1(10);
		Withparametermethodpractice.m2("Name");
	}
	public void m1(int i ) {
		System.out.println("Non static method with parameter");
	}
	public static void m2( String s) {
		System.out.println("Static method with parameter");
	}

}
