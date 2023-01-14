package Logical;

public class FactorialNumber {

	public static void main(String[] args) {
//    The factorial number is the product of all integers from 1 to that number
//    for example, the factorial of 6 is 1*2*3*4*5*6=720. Factorial is not defined for
//    negative numbers and the factorial of zero is one,0!

		int num = 5;
		int fact =1 ;
		for(int i=num;i>=1;i--) {
			fact=fact*i; // 1=1*5=5*4=20*3=60*2=120*1=120
		}
		System.out.println(fact);
	}
}
