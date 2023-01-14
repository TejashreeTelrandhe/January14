package Package1;

public class CTPMethodoverloadingpractice {

	public static void main(String[] args) {
		CTPMethodoverloadingpractice B = new CTPMethodoverloadingpractice();
	B.m1();
	B.m1(10);
    m1(20, 30);
    m1(20, 30,40);
	}
	public void m1() {
		System.out.println("No input");
	}
	public void m1(int i) {
		System.out.println("One input");
	}
	public static void m1(int i, int j) {
		System.out.println("Two input");
	}
	public static void m1(int i, int j, int k) {
		System.out.println("Three input");
	}
}
