package Package2;

public class IntegerPalindrome1 {

public static void main(String[] args) {
int no = 212;
int temp = no;  // 212
int rev =0; 
int rem;

while(temp!=0) {
	rem = temp%10; //2 , 1 , 2
	rev = rev*10+rem;  //2 , 21 , 212
	temp = temp/10; //21 , 2 , 0
}
if(no==rev) {
	System.out.println(no+" : is a palindrome");
}
else {
	System.out.println(no+" : is not a palindrome");
}

System.out.println();
}
}
