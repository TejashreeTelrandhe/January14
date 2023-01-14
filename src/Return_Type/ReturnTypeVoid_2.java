package Return_Type;

public class ReturnTypeVoid_2 {

	public static void main(String[] args) {
		ReturnTypeVoid_2.addition(12, 2);
		ReturnTypeVoid_2.addition1(45, 10);
//		int number =addition(20,30);
//	    Return type void hence addition method cannot be used in other method.
		int num =addition1(15,25);
		System.out.println(num);
//		Return type primitive datatype hence addition1 method can be used in other method.

	}
public static void addition(int a, int b) {
	int sum = a+b;
	System.out.println("Addition method1 :"+sum);
}
public static int addition1(int c, int d) {
	int sum = c+d;
	System.out.println("Addition method2 :"+sum);
	return sum;
}
}
