package LogicalPgm_19Dec;

import java.util.Scanner;

public class Integer_UserInput {

public static void main(String[] args) {
	System.out.println("Integer user input");
Scanner scan = new Scanner(System.in);
//The "standard" input stream. This stream is already open and ready to supply input data. 
System.out.println("Enter first number");
int num1 = scan.nextInt();//Scans the next token of the input as an int. 
System.out.println("Enter second number");
int num2 = scan.nextInt();
System.out.println("Addition = "+(num1+num2));//92
System.out.println("Substraction = "+(num1-num2));//12
System.out.println("Multiplication = "+(num1*num2));//2080
System.out.println("Division = "+(num1/num2));//1


	}

}
