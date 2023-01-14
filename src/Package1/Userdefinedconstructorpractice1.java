package Package1;

public class Userdefinedconstructorpractice1 {
	String name;
	int age;
	String bloodgroup;
	public Userdefinedconstructorpractice1() {
	name ="Saurabh";
    age = 23;
    bloodgroup = "B+";
	}
 public void m1() {
	 System.out.println(name);
 }
 public static void m2() {
	 Userdefinedconstructorpractice1 C = new Userdefinedconstructorpractice1();
	 System.out.println(C.age);
 }
 public void m3() {
	 System.out.println(bloodgroup);
 }
public static void main(String[] args) {
	Userdefinedconstructorpractice1 C1 = new Userdefinedconstructorpractice1();
C1.m1();
C1.m3();
Userdefinedconstructorpractice1.m2();
	}
}