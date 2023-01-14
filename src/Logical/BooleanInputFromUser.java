package Logical;

import java.util.Scanner;

public class BooleanInputFromUser {

public static void main(String[] args) {
	
Scanner ss = new Scanner(System.in);

System.out.println("Enter boolean value");

boolean b = ss.nextBoolean();

System.out.println("Boolean value entered is "+b);

// nextBoolean() : Scans the next token of the input into a boolean value 
//and returns that value. This method will throw InputMismatchException if
//the next token cannot be translated into a valid boolean value.If the
//match is successful, the scanner advances past the input that matched.
}

}
