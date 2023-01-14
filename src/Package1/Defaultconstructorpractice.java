package Package1;

public class Defaultconstructorpractice {
String name;
int rollno;
// When constructor not created default constructor is called  for the object initialization by compiler 

	public static void main(String[] args) {
		
		Defaultconstructorpractice.m2();//Static method called using classname.methodname
		sub(13);//Static method called directly using methodname
		Defaultconstructorpractice D = new Defaultconstructorpractice();
		D.m1();//Non static method called using object creation
        D.add(12);//Non static method called using object creation
		
	}
public void m1() {//Non static method zero parameter
	System.out.println("Tejashree");
}
public static void m2() {//Static method zero parameter
	System.out.println("5");
}
public void add(int i) {//Non static method one parameter
	int a = 4;
	int b = 5;
	int c =a+b;
	System.out.println(c);
}
public static void sub(int j) {//Static method one parameter
	int x= 12;
	int y= -13;
	int z = x-y;
	System.out.println(z);
}
}
