package Package1;

public class Hierarchialinheritancepractice2 extends Hierarchialinheritancepractice1{
	public void m9() {
		System.out.println("Method 9");
	}
	public void m10() {
		System.out.println("Method 10");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlelevelinheritancepractice1 S1= new Singlelevelinheritancepractice1 ();
		S1.m1();
		S1.m2();
		S1.m3();
		System.out.println();
		Singlelevelinheritancepractice2 S2= new Singlelevelinheritancepractice2 ();
		S2.m1();
		S2.m2();
		S2.m3();
		S2.m4();
		S2.m5();
		System.out.println();
		Hierarchialinheritancepractice1 H1 = new Hierarchialinheritancepractice1();
		H1.m1();
		H1.m2();
		H1.m3();
		H1.m4();
		H1.m5();
        H1.m6();
        H1.m7();
        H1.m8();
        System.out.println();
		Hierarchialinheritancepractice2 H2 = new Hierarchialinheritancepractice2();
		H2.m1();
		H2.m2();
		H2.m3();
		H2.m4();
		H2.m5();
        H2.m6();
        H2.m7();
        H2.m8();
		H2.m9();
		H2.m10();
}
}
