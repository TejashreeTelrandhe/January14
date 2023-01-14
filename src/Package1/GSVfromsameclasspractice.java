package Package1;

public class GSVfromsameclasspractice {
static String s="Teja";
static int rollno= 56;
	public static void main(String[] args) {
		System.out.println(s);
		System.out.println(rollno);
		System.out.println();
		GSVfromsameclasspractice GSV = new GSVfromsameclasspractice() ;
		GSV.m1();
		GSVfromsameclasspractice.m2();
		}
public void m1() {
	System.out.println(s);
	System.out.println(rollno);
	char grade='A';
	float percentage= 85.5f;
	System.out.println(grade);
	System.out.println(percentage);
	System.out.println();
}
public static void m2() {
	System.out.println(s);
	System.out.println(rollno);
//	System.out.println(grade);
//	System.out.println(percentage);
}
}
