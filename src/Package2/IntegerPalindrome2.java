package Package2;

public class IntegerPalindrome2 {

	public static void main(String[] args) {
int num = 202;
int temporary = num;
int rev =0;
int rem;

while(temporary!=0) {
	rem = temporary %10;
	rev = rev*10 + rem;
	temporary = temporary /10;
}
if(num == rev) {
	System.out.println(num+ ": Palindrome")	;
}
else {
	System.out.println(num+ ": Not palindrome");
}
	}

}
