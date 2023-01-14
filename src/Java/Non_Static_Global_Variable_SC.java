package Java;

public class Non_Static_Global_Variable_SC {
	String college = "Mohota Science";
	int rollno = 55;
	String name ="Tejashree";
	char grade = 'A';
	double percentage = 80.52;
	
	public static void main(String[] args) {
		Non_Static_Global_Variable_SC jj = new Non_Static_Global_Variable_SC();
		System.out.println(jj.college);
		System.out.println(jj.rollno);		
		System.out.println(jj.name);
		System.out.println(jj.grade);
		System.out.println(jj.percentage);
		
	}

}
