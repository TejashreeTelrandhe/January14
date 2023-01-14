package Package1;

public class AutomaticPpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomaticPpractice M= new AutomaticPpractice();
		M.m1();
		M.m1(4);
		M.m1(456789123l);
		M.m1(60.10f);
		M.m1(45.2);
	}
	public void m1() {
		System.out.println("Zero input parameter");
	}
	public void m1(int i) {
		System.out.println("Int input paramter");
	}
	// int data type method if absent then long datatype method will executes
	//public void m1(long l) {
//		System.out.println("Long input parameter");
	//}
	//public void m1(float f) {
//		System.out.println("Float input parameter");
	//}
	public void m1(double d) {
		System.out.println("Double input parameter");
	}
}
