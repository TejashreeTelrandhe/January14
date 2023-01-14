package Polymorphism;

public class MethodOverloading_2 {

	public static void main(String[] args) {
		MethodOverloading_2.mul(45.6, 48.75);
		MethodOverloading_2 j = new MethodOverloading_2();
		j.add(10, 20);
		j.add(15, 20, 25);
		j.mul(14, 17, 12);
	}
public void add(int i, int j) {
	System.out.println("Addition of two number = "+(i+j));
}
public void add( int k, int l, int m) {
	System.out.println("Addition of three numbers = "+(k+l+m));
}
public static void mul(double a , double b) {
	System.out.println("Multiplication of two numbers = "+(a*b));
}
public void mul(double c, double d, double e) {
	System.out.println("Multiplication of three numbers = "+(c*d*e));
}
}
