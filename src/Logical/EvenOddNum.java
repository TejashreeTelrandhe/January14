package Logical;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
Scanner Sc= new Scanner(System.in);
System.out.println("Enter num");
int num = Sc.nextInt();
if(num%2==0) {
	System.out.println("Even");
}
else {
	System.out.println("Odd");
}
	}

}
