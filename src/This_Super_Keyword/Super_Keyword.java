package This_Super_Keyword;

public class Super_Keyword extends This_Keyword{
	int age = 27;
	String name ="asawari";
	static String college = "Shri niketan College, Nagpur";
	float percentage = 80.1f;
	public static void main(String[] args) {
		Super_Keyword ss = new Super_Keyword();
		ss.m1();
	}
	public void m1() {
			String name ="tejasvi";
			String college = "Prerna college nagpur";
			float percentage = 92.5f;
			int age = 28;
		
		System.out.println(college);// Prerna College, Nagpur
		System.out.println(age);//28
		System.out.println(name);//tejasvi
		System.out.println(percentage); //92.5
        System.out.println();
        System.out.println(this.age);//27
		System.out.println(this.name);//asawari
		System.out.println(this.percentage); //80.1
		System.out.println(this.college);//Shri niketan College, Nagpur
		System.out.println();
        System.out.println(super.name); //tejashree
		System.out.println(super.college);//SMM COllege,Nagpur
		System.out.println(super.age);//24
	}

}
