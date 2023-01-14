package Package1;

public class Superkeywordpractice extends Thiskeywordpractice {
	int number = 20;
	public static void main(String[] args) {
		Superkeywordpractice  T1 = new Superkeywordpractice ();
		T1.m1();

	}
public void m1() {
	int number =10;
	System.out.println(number);
	System.out.println(this.number);
	System.out.println(super.number);
}		

	

}
