package Package1;

public class Singlelevelinheritancepractice2 extends Singlelevelinheritancepractice1{
	public void m4() {
		System.out.println("Method 4");
	}
	public void m5() {
		System.out.println("Method 5");
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
	}

}
