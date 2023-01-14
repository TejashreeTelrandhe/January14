package Java;

public class Automatic_Promotion {

	public static void main(String[] args) {
		Automatic_Promotion app = new Automatic_Promotion();
		app.method();
		app.method(75);
		app.method(4536l);
		app.method(45.6f);
		app.method(789.222);
	}
	public void method() {
		System.out.println("byte datatype method");
		}
//	public void method(int a) {
//		System.out.println("int datatype method");
//	}
	public void method(long l) {
        System.out.println("long datatype method");
    }
//	public void method(float f) {
//		System.out.println("float datatype method");
//	}
	public void method(double d) {
		System.out.println("double datatype method");
	}
//	 The name Type Promotion specifies that a small size datatype 
//	can be promoted to a large size datatype. i.e., an Integer data 
//	type can be promoted to long, float, double, etc.
	
//	byte ---> short---->int--> long --->float--->double
//                      |
//           char-------- 
}