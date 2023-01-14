package This_Super_Keyword;

public class This_Keyword {
int rollno =789401;
int age = 24;
String name ="tejashree";
String college = "SMM College, Nagpur";
float percentage = 85.6f;
public static void main(String[] args) {

This_Keyword tt = new This_Keyword();
tt.m1();
	}
public void m1() {
	String name ="tejasvi";
	String college = "Prerna college nagpur";
	float percentage = 92.5f;
	int age = 28;
	System.out.println(name); //tejasvi
	System.out.println(college); //Prerna college nagpur
	System.out.println(percentage); //92.5
	System.out.println(age); //28
	System.out.println(this.age); // 24
	System.out.println(this.name);// tejashree
	System.out.println(this.college); //SMM College, Nagpur
	System.out.println(this.percentage); // 85.6
}
}
