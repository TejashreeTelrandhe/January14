package Return_Type;

public class ReturnTypeVoid_1 {

	public static void main(String[] args) {
		ReturnTypeVoid_1.addition(15,20);//Addition :35
		ReturnTypeVoid_1.addition(30,40);//Addition :70
		ReturnTypeVoid_1.multiply(12,12);//Multiplication :144
		                                 //Addition :120
		                                 //Using addition method in multiply method :120
}
public static int addition(int a, int b) {
	int sum= a+b;
	System.out.println("Addition :"+sum);
	return sum;
}
public static void multiply(int i, int j) {
	int mul = i*j;
	System.out.println("Multiplication :"+mul);
	System.out.println("Using addition method in multiply method :"+addition(50,70));
}
}
