package Java;

public class Control_Statement {
public static void main(String[] args) {
//	if Control Statement
int marks = 45;
if(marks >=35) {
	System.out.println("Marks = "+marks);
}
//if else Control Statement

int i = 100;
if(i<=99) {
	System.out.println("Value of i = "+i);
}
else {
	System.out.println("Condition not matches");
}

//if else if Control Statement

String blood ="A";
if(blood.equals("B")) {
	System.out.println("B");
}
else if(blood.equals("A")) {
	System.out.println("A");
}
else {
	System.out.println("Blood group not matches");
}
//  Nested if COntrol Statement
String UN="abc";
String PWD= "xyz";
if (UN=="abc"){
System.out.println("correct UN");
if (PWD=="xyz1"){
System.out.println("incorrect PWD");
System.out.println("login failed");
}
else if(UN=="abc"&& PWD=="xyz"){
System.out.println("correct PWD");
System.out.println("login successful");
}
}
else{
System.out.println("incorrect UN");
System.out.println("incorrect PWD");
System.out.println("login failed");
}
// Switch COntrol Statement
String option= "Debit Card";
switch(option) {
case ("Credit Card"):System.out.println("Credit card accepted");
break;
case ("Debit Card"):System.out.println("Debit card accepted");
break;
case ("Adhaar Card"): System.out.println("Adhaar card accepted");
break;
case ("Licence Card"): System.out.println("Licence accepted");
break;
case ("Passport"):System.out.println("Passport accepted");
break;
default :System.out.println("No switch condition matches");
}
}
}
