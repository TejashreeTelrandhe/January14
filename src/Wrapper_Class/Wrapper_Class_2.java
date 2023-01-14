package Wrapper_Class;

public class Wrapper_Class_2 {

	public static void main(String[] args) {
String s1 ="200";
String s2 ="300";
System.out.println(s1+s2);//200300

int num = Integer.parseInt(s1);//     Parses the string argument as a signed decimal integer. 
int number = Integer.parseInt(s2);
int sum = num+number;
System.out.println(sum);//500

if(sum==500) {
	System.out.println("Passed");//Passed
}
else {
	System.out.println("Failed");
}

System.out.println();

String s3= "45.56";
String s4= "89.25";
System.out.println(s3+s4);//45.5689.25

double d1 =Double.parseDouble(s3);//    Returns a new double initialized to the value represented by the specified String, 
                                  //    as performed by the valueOf method of class Double.
double d2 =Double.parseDouble(s4);
double d = d1+d2;
System.out.println(d);//134.81

if(d==453.5) {
	System.out.println("Passed");
}
else {
	System.out.println("Failed");//Failed
}
}
}
