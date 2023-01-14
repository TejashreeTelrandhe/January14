package Package1;

public class If_Else_Ifcontrolstatementpractice {

	public static void main(String[] args) {
//      Statement whose condition is satisfied is executed
//		1. Program
int marks = 42;
if(marks>=65) {
	System.out.println("First Class");
}
else if(marks>=60) {
	System.out.println("Higher Second Class");
}
else if(marks>=55) {
	System.out.println("Second Class");
}
else if(marks>=45) {
	System.out.println("Third Class");
}
else if(marks>=35) {
	System.out.println("Pass");
}
else {
	System.out.println("Fail");
}

//       2. Program 

String s ="Tejas";
if(s=="Priya") {
	System.out.println("Priya has cleared UPSC");
}
else if (s=="Rahul") {
	System.out.println("Rahul has cleared UPSC");
}
else if (s=="Tejas") {
	System.out.println("Tejas has cleared UPSC");
}
else {
	System.out.println("No one cleared exam");
}
}
}
