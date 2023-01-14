package LogicalPgm_19Dec;

public class Factorial_Number {

	public static void main(String[] args) {
//  Factorial number :  Factorial of n is the product of all positive descending integers. 
//  from that number to 1. example: factorial of 6 = 6*5*4*3*2*1=720
//  Factorial is not defined for negative numbers and factorial of zero is 1.
		
		int num1 = 6;
		int fact = 1;
		for(int i = num1 ;i>=1;i--) {
			fact =fact*i;//1*6=6 
			//6*5=30
			//30*4=120
			//120*3=360
			//360*2=720
			//720*1=720
		}
		System.out.println(fact);
	}

}
