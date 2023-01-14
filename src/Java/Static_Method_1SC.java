package Java;

public class Static_Method_1SC {

	public static void main(String[] args) {
 method1();
 method2("rr");
 Static_Method_1SC.method3("ss", 1);
 Static_Method_1SC.method4("tt", 2, false);
	}
public static void method1() {
	System.out.println("Method 1");
	}

public static void method2(String s) {
	System.out.println("Method 2");
	s="SameClass";
	System.out.println("String = "+s);
}

public static void method3(String s1, int i1) {
	System.out.println("Method 3");
	s1="Static";
	i1= 1;
	System.out.println("String = "+s1+" ,Integer = "+i1);
}

public static void method4(String s2, int i2, boolean b) {
	System.out.println("Method 4");
	s2="MainMethod";
	i2= 2;
	b= true;
	System.out.println("String = "+s2+" ,Integer = "+i2+" ,Boolean = "+b);
}
}
