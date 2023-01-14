package Java;

public class Non_Static_Global_Variable_DC {
String std="Msc";
String FatherName="Tulsidas";
String LastName="Telrandhe";
public static void main(String[] args) {
	Non_Static_Global_Variable_SC jj = new Non_Static_Global_Variable_SC();
	System.out.println(jj.college);
	System.out.println(jj.rollno);		
	System.out.println(jj.name);
	System.out.println(jj.grade);
	System.out.println(jj.percentage);
	Non_Static_Global_Variable_DC kk = new Non_Static_Global_Variable_DC();
	System.out.println(kk.std);
	System.out.println(kk.FatherName);
	System.out.println(kk.LastName);
	}
}
