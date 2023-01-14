package Return_Type;

public class ReturnTypeVoid_3 {

	public static void main(String[] args) {
		ReturnTypeVoid_3.method1(1);  
		ReturnTypeVoid_3.method2();   //30
		ReturnTypeVoid_3.method3(1);  //25
		ReturnTypeVoid_3.method4();   //50
		                              //5
}
public static int method1(int k) {
	return 5*k;
}
public static void method2() {
	System.out.println("method1 used in method2 "+method1(6));
}
public static int method3(int m) {
	System.out.println("method1 used in method3 "+method1(5) );
	return 50-m;
}
public static void method4() {
	System.out.println("method1 used in method4 "+method1(10));
	System.out.println("method3 used in method4 "+method3(45));
}
}
