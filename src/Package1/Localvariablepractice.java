package Package1;

public class Localvariablepractice {
public static void main(String[] args) {
	Localvariablepractice V= new Localvariablepractice();
	V.m1();
	System.out.println();
	Localvariablepractice.m2();
}
public void m1() {
	int a =10;
	int b = 5;
	int c =a+b;
	System.out.println(c);
//	System.out.println(i);
//	System.out.println(j);
//	System.out.println(k);
}
public static void m2() {
	int j = 25;
	int k =23;
	int i =j-k;
	System.out.println(i);
//	System.out.println(c);
//	System.out.println(a);
//	System.out.println(b);
}
}
