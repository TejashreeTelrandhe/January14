package Package1;

public class CTPMainmethodoverloadingpractice {

	public static void main(String[] args) {
		CTPMainmethodoverloadingpractice C1 = new CTPMainmethodoverloadingpractice();
		C1.m1();
		C1.m2();
	}
	public static void main(int[] args) {
		CTPMainmethodoverloadingpractice C2 = new CTPMainmethodoverloadingpractice();
		C2.m1();
		C2.m2();
	}
	public static void main(short[] args) {
		CTPMainmethodoverloadingpractice C3 = new CTPMainmethodoverloadingpractice();
		C3.m1();
		C3.m2();
	}
	public void m1() {
		System.out.println("Non static m1");
	}
	public void m2() {
		System.out.println("Non static m2");
	}
}
