package Java;

public class Non_Static_Method_1DC {

	public static void main(String[] args) {
		Non_Static_Method_1SC SC = new Non_Static_Method_1SC();
		SC.method1();
		SC.method2("Java");
		SC.method3("OOPs", 0);
		SC.method4("Principle", 10, false);
		System.out.println();
		
		Non_Static_Method_1DC DC = new Non_Static_Method_1DC();
		DC.method5();
		DC.method6();
		DC.method7('J');
	}
public void method5() {
	System.out.println("Method 5");
}
public void method6() {
	System.out.println("Method 6");
}
public void method7(char c) {
	System.out.println("Method 7");
}
}
