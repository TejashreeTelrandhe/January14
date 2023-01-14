package Package1;

public class RTPStaticMethodoverridingpractice2 extends RTPStaticMethodoverridingpractice1{
//@Override
	public static void money() {
		System.out.println("Static child method m1");
	}
//@Override
	public static void money(int i) {
		System.out.println("Static child method m2");
	}
@Override
	public void money(String s) {
		System.out.println("Static child method m3");
	}
@Override
public void money(int i, int j) {
		System.out.println("Static child method m4");
	}
	public static void main(String[] args) {

		RTPStaticMethodoverridingpractice1 N1 = new RTPStaticMethodoverridingpractice1 () ;
		N1.money();
		N1.money(10);
		N1.money("Riya");
		N1.money(11, 12);
		System.out.println();
		RTPStaticMethodoverridingpractice2 N2 = new RTPStaticMethodoverridingpractice2 () ;
		N2.money();
		N2.money(10);
		N2.money("Riya");
		N2.money(11, 12);
		System.out.println();
		RTPStaticMethodoverridingpractice1 N3 = new RTPStaticMethodoverridingpractice2 () ;//top casting //dynamic polymorphism
		N3.money();//method hiding
		N3.money(10);//method hiding
		N3.money("Riya");
		N3.money(11, 12);
		System.out.println();
		RTPStaticMethodoverridingpractice2 N4 = (RTPStaticMethodoverridingpractice2) new RTPStaticMethodoverridingpractice1 () ;//down casting
		}
}
