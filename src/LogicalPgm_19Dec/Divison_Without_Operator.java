package LogicalPgm_19Dec;

import java.util.Scanner;

public class Divison_Without_Operator {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 20;
		int result = 0;
		while (num1 >= num2) { // 100>20 //80>20 //60>20 //40>20 //20=20
			num1 = num1 - num2; // 100-20 =80
								// 80-20 =60
								// 60-20 =40
								// 40-20 =20
								// 20-20 =0
			result++;
		}
		System.out.println(result);

		System.out.println("Taking user input");

		int result1 = 0;// variable declaration
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value to number1: ");
		int number1 = scan.nextInt();// Reading the input for number1

		System.out.print("Enter the value to number2: ");
		int number2 = scan.nextInt();// Reading the input for number2

		while (number1 >= number2) {
			number1 = number1 - number2;
			result1++;
		}
		System.out.println("Division is:" + result1);
	}
}
