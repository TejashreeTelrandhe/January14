package Package1;

public class Palindromenumber1 {

	public static void main(String[] args) {
int number =121;
int temporary=number;
int reverse =0;
int remainder;

while(temporary!=0) {
	remainder=temporary%10;                 // 1 , 2 , 1
	reverse = reverse*10+remainder;         // 1 , 12 , 121
	temporary = temporary/10;               // 12 , 1 , 0
	
}
if(number==reverse) {
	System.out.println(number +" : Palindrome");
}
else {
	System.out.println(number +" : not a palindrome");
}
	}

}
