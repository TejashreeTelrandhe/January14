package Package1;

public class Nested_Ifcontrolstatementpractice {

	public static void main(String[] args) {
//  1. Nested is statement program
int a = 10;
int b = 30;
int c = 50;
if(a>=b) {
	if(a>=c) {
		System.out.println("A is greatest number");
	}
	else if (b>=c) {
		System.out.println("B is greatest number");
	}
}
else {
	System.out.println("C is greatest number");
}
System.out.println();

//1. Nested is statement program
int marks= 15;
if(marks<=25) {
	if(marks<=20) {
		System.out.println("Marks are below average");
	}
	else if (marks>=30) {
		System.out.println("Marks are average");
	}
	else{
		System.out.println("Good performance");
	}
}
	}

}
