package Package1;

public class GNSVfromsameclasspractice {

	String college= "SMS college nagpur";
	int courses = 15;
	float admission = 89.00f;

	public static void main(String[] args) {
			GNSVfromsameclasspractice N1 = new GNSVfromsameclasspractice();
			System.out.println(N1.college);
			System.out.println(N1.courses);
			System.out.println(N1.admission);
			System.out.println();
			N1.m1();//calling by object creation
			GNSVfromsameclasspractice.m2();// calling by classname.methodname
			N1.m3();//calling by object creation
		}
	public void m1() {//non static method when call need not to create object from printing GV
		String college= "Nutan college umred";
		int courses = 7;
		float admission = 79.02f;
		System.out.println(college);
		System.out.println(courses);
		System.out.println(admission);
		System.out.println();
	}
	public static void m2() {//static method when call needs to create object from printing GV
		GNSVfromsameclasspractice N2 = new GNSVfromsameclasspractice();
		System.out.println(N2.college);
		System.out.println(N2.courses);
		System.out.println(N2.admission);
		System.out.println();
	}
	public void m3() {//non static method when call need not to create object from printing GV
		System.out.println(college);
		System.out.println(courses);
		System.out.println(admission);
	}
	}


