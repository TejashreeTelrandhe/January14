package Package1;

public class RTPMethodoverridingpractice2 extends RTPMethodoverridingpractice1{
	@Override
	public void m1() {
		System.out.println("Zero input");
	}
	@Override
	public void m1(int i) {
		System.out.println("int input");
	}
	//@Override
	public void m1(String s) {
		System.out.println("String input");
	}
	public static void main(String[] args) {
		RTPMethodoverridingpractice1 N1= new  RTPMethodoverridingpractice1();
		N1.m1();
		N1.m1(2);
		RTPMethodoverridingpractice2 N2= new  RTPMethodoverridingpractice2();
		N2.m1();
		N2.m1(12);
		N2.m1('&');
		RTPMethodoverridingpractice1 N3= new  RTPMethodoverridingpractice2();// top casting  // dynamic polymorphism
		N3.m1();
		N3.m1(2);
		//N3.m1("Piyu");
		RTPMethodoverridingpractice2 N4= (RTPMethodoverridingpractice2) new  RTPMethodoverridingpractice1();// down casting
	}
}
