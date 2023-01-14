package LogicalPgm_19Dec;

public class Palindrome_Number {

	public static void main(String[] args) {
//		A palindrome number is a number that is same after reverse. For example 
//		545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 

		int num = 48584;
		int temporary = num; // temporary =48584
		int reverse = 0;
		int remainder;

		while (temporary != 0) { // 48584!=0 // 4858 !=0 //485 !=0 //48!=0 //4!=0
			remainder = temporary % 10; // 48584 %10 = 4 // 4858%10 = 8 //485%10 =5 // 48%10 = 8 //4%10=4
			reverse = reverse * 10 + remainder; // 0*10+4 =4 // 4*10+8 =48 // 48*10+5 = 485 //485*10+8=4858 
			                                   //4858*10+4 = 48584
			temporary = temporary / 10; // 48584/10= 4858 // 4858/10 = 485 //485/10 = 48 //48/10=4 //4/10 =0
		}
		if (num == reverse) { // 48584 == 48584 
			System.out.println(num + " is a palindrome number");
		} else {
			System.out.println(num + " is not a palindrome number");
		}
	}

}
