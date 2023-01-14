package Package1;

public class Userdefinedconstructorpractice2 {
String college;
int courses;
long mobno;
char rating;
public Userdefinedconstructorpractice2() {
	college ="SMS COllege";
	courses= 10;
	mobno=8999427533l;
	rating='5';
	System.out.println("collegename1");
}
public Userdefinedconstructorpractice2 (String college1,int courses1,long mobno1,char rating1) {
	college=college1;
	courses=courses1;
	mobno=mobno1;
	rating=rating1;
	System.out.println("collegename2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userdefinedconstructorpractice2 U = new Userdefinedconstructorpractice2();
		 U.collegename1();
		Userdefinedconstructorpractice2 U1 = new Userdefinedconstructorpractice2("Nutan college", 7,9658741231l,'4');
        U1.collegename2();
	}
public void collegename1() {
	System.out.println(college);
	System.out.println(courses);
	System.out.println(mobno);
	System.out.println(rating);
}
public void collegename2() {
	System.out.println(college);
	System.out.println(courses);
	System.out.println(mobno);
	System.out.println(rating);
}
}
