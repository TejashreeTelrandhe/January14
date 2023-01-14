package Logical;

import java.util.Scanner;

public class InputfromUser {
public static void main(String[] args) {
	Scanner ss= new Scanner(System.in);
	
	System.out.println("Enter num 1");
	
	int num1= ss.nextInt();
	
	Scanner cc= new Scanner (System.in);
	
	System.out.println("Enter num 2");
	
	int num2 = cc.nextInt();
	
	System.out.println("Multiplication of num1 and num2 = "+num1*num2);
	
//nextInt : Scans the next token of the input as an int. 

}
}
