package Package1;

public class Palindromenumber3 {

	public static void main(String[] args) {
		int num =125;
		int temp = num;
		int rev=0;
		int rem;

		while(temp!=0) {
			rem = temp % 10;                 // 5,2,0
			rev = rev * 10 + rem;            // 5,52,520
			temp = temp /10;                 // 12,1,0
		}
		if(num == rev) {
			System.out.println("Palindrome :"+ num);
		}
		else {
			System.out.println("Not plaindrome :"+ num);
		}
	}

}
