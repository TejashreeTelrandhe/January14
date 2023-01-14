package Java;

public class Static_Method_1DC {

	public static void main(String[] args) {
		System.out.println("Different Class Methods");
		Static_Method_1SC.method1();
		Static_Method_1SC.method2("String");
		Static_Method_1SC.method3("int", 2);
		Static_Method_1SC.method4("boolean", 2, false);
		System.out.println();
		System.out.println("Same Class Methods");
		Static_Method_1DC.method5();
		Static_Method_1DC.method6();
	}
public static void method5() {
	System.out.println("Method 5");
}
public static void method6() {
	System.out.println("Method 6");
}
}
