package LogicalPgm_19Dec;

import java.util.Scanner;

public class Even_Odd_Scanner {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter integer");
int number = scan.nextInt();

if (number%2==0) {
	System.out.println("Number entered is even integer");
}
else {
	System.out.println("Number entered is odd integer");

}
}
}
