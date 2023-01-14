package Java;

public class Static_Global_Variable_DC {
static String std="Msc";
static String FatherName="Tulsidas";
static String LastName="Telrandhe";
public static void main(String[] args) {
	System.out.println("college : "+Static_Global_Variable_SC.college);
	System.out.println("rollno : "+Static_Global_Variable_SC.rollno);
	System.out.println("name : "+Static_Global_Variable_SC.name);
	System.out.println("grade : "+Static_Global_Variable_SC.grade);
	System.out.println("percentage : "+Static_Global_Variable_SC.percentage);
	
	System.out.println("std : "+std);
	System.out.println("FatherName : "+FatherName);
	System.out.println("LastName : "+LastName);
	}

}
