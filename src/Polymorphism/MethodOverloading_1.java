package Polymorphism;

public class MethodOverloading_1 {

public static void main(String[] args) {
portable("Selenium");
portable(3.0);
portable ("Java" , 18);
	}
public static void portable (String s) {
	System.out.println(s);
}
public static void portable (double d) {
	System.out.println(d);
}
public static void portable (String ss, int vv) {
	System.out.println(ss +", "+vv);
}
}
