package Package1;

public class StaticmethodfromDCpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticmethodfromSCpractice.m1();// calling by classname.methodname
		StaticmethodfromSCpractice.m2();// calling by classname.methodname
		StaticmethodfromSCpractice.m3();// calling by classname.methodname
		StaticmethodfromSCpractice.m4();// calling by classname.methodname
		System.out.println();
		m5();// calling by method name
		m6();// calling by method name
	}
	public static void m5() {
		System.out.println("Static Method same class m5");
	}
	public static void m6() {
		System.out.println("Static Method same class m6");
	}
}
