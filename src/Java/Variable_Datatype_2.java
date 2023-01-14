package Java;

public class Variable_Datatype_2 {
	public static void main(String[] args) {
	//variable declaration
	String StudentFirstName;
	String StudentFatherName;
	String StudentLastName;
	int StudentAge;
	int StudentClass;
	char StudentGrade;
	float StudentPer;
	
	// variable initialization
	StudentFirstName= "MANGESH";
	StudentFatherName= "ANIRUDDH";
	StudentLastName= "CHEWALE";
	StudentAge= 10;
	StudentClass= 4;
	StudentGrade= 'A';
	StudentPer= 95.3f;
	
	//usage
	System.out.println("StudentFirstName =" + StudentFirstName);
	System.out.println("StudentFatherName =" + StudentFatherName);
	System.out.println("StudentLastName =" + StudentLastName);
	System.out.println("StudentAge =" + StudentAge + "Year");
	System.out.println("StudentClass =" + StudentClass + "th");
	System.out.println("StudentGrade =" + StudentGrade );
	System.out.println("StudentPer =" + StudentPer + "%");	
}
}