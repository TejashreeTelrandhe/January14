package Logical;

import java.util.Scanner;

public class StringInputFromUser {
public static void main(String[] args) {
Scanner SC= new Scanner(System.in);
System.out.println("Enter String");
String str = SC.nextLine();
System.out.println("The string you entered is "+str);

// nextLine() : Advances this scanner past the current line and returns the
//input that was skipped.This method returns the rest of the current line, 
//excluding any line separator at the end. The position is set to the beginning 
//of the next line. 

	}

}
