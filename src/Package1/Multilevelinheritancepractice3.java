 package Package1;

public class Multilevelinheritancepractice3 extends Multilevelinheritancepractice2{
	public void laptop() {
		System.out.println("Laptop");
	}
	public static void main(String[] args) {
		Multilevelinheritancepractice1 M1= new Multilevelinheritancepractice1();
		M1.property();
		Multilevelinheritancepractice2 M2= new Multilevelinheritancepractice2();
		M2.mobile();
	    M2.property();
		Multilevelinheritancepractice3 M3= new Multilevelinheritancepractice3();
		M3.laptop();
		M3.mobile();
	    M3.property();
	}

}
