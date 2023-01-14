package Package1;

public class Palindromenumber2 {

	public static void main(String[] args) {
int num =565;
int temp = num;
int rev=0;
int rem;

while(temp!=0) {
	rem = temp % 10;                 // 5,   6,  5
	rev = rev * 10 + rem;            // 5,   56, 565
	temp = temp /10;                 // 56,  5,   0
}
if(num == rev) {
	System.out.println("Palindrome :"+ num);
}
else {
	System.out.println("Not plaindrome :"+ num);
}
	}

}
