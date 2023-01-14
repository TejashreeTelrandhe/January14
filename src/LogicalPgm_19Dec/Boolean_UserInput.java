package LogicalPgm_19Dec;

import java.util.Scanner;

public class Boolean_UserInput {

	public static void main(String[] args) {
System.out.println("Boolean user input");
Scanner scan = new Scanner(System.in);
System.out.println("Enter boolean value");
boolean b = scan.nextBoolean();
// nextBoolean() : Scans the next token of the input into a boolean value and returns that value. 
System.out.println("You have entered : "+b);
	}

}
