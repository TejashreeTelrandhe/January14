package Package1;
public class Userdefinedconstructorpractice {
int rollno;
String name;
char grade;
float percentage;
public Userdefinedconstructorpractice() {
	System.out.println("User define constructor");
}
public Userdefinedconstructorpractice(int rollno) {
	System.out.println(rollno);
}
public Userdefinedconstructorpractice(String name) {
	System.out.println(name);
}
public Userdefinedconstructorpractice(char grade) {
	System.out.println(grade);
}
public Userdefinedconstructorpractice(float percentage) {
	System.out.println(percentage);
}
public Userdefinedconstructorpractice(float percentage,int rollno) {
	System.out.println(percentage+"  "+rollno);
}
public Userdefinedconstructorpractice(char grade,String name, float percentage) {
	System.out.println(grade+" "+name+" "+percentage);
}
	public static void main(String[] args) {
		Userdefinedconstructorpractice N = new Userdefinedconstructorpractice();
		Userdefinedconstructorpractice N1 = new Userdefinedconstructorpractice("Rim");
		Userdefinedconstructorpractice N2 = new Userdefinedconstructorpractice(24);
		Userdefinedconstructorpractice N3 = new Userdefinedconstructorpractice('A');
		Userdefinedconstructorpractice N4 = new Userdefinedconstructorpractice(11.2f);
		Userdefinedconstructorpractice N5 = new Userdefinedconstructorpractice(15.62f, 6);
		Userdefinedconstructorpractice N6 = new Userdefinedconstructorpractice('B',"Tia", 56.3f);
		m1();
		N6.m2();
	}
public static void m1() {
	Userdefinedconstructorpractice N7 = new Userdefinedconstructorpractice();
	System.out.println(N7.rollno+"  "+N7.name+"  "+ N7.grade+"  "+N7.percentage);
}
public void m2() {
	System.out.println(rollno+" "+name+" "+grade+" "+percentage);
}
}
