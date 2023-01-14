package Package1;

public class NonstaticmethodfromDCpractice {

	public static void main(String[] args) {
		NonstaticmethodfromSCpractice P = new NonstaticmethodfromSCpractice();
		P.m1();
		P.m2();
		P.m3();
		P.m4();
		NonstaticmethodfromDCpractice J= new NonstaticmethodfromDCpractice();
		 J.m5();
		 J.m6();
	}
	public void m5() {
		System.out.println("Non-Static Method same class m5");
	}
	public void m6() {
		System.out.println("Non-Static Method same class m6");
	}
}
