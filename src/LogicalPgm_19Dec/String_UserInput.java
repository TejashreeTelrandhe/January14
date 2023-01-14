package LogicalPgm_19Dec;

import java.util.Scanner;

public class String_UserInput {

	public static void main(String[] args) {
		System.out.println("String user input");
		System.out.println("Enter string");
		Scanner scan1 = new Scanner(System.in);
		String string = scan1.nextLine();
		System.out.println("String value : "+string);
	}

}
