package Logical;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {

int originalnum =121;
int rem ;
int samplenum=originalnum;
int rev=0 ;
while(samplenum!=0) {
	rem=samplenum%10;
	rev = rev*10+rem;
	samplenum= samplenum/10;
}
if(originalnum==rev) {
	System.out.println(originalnum+" is a Palindrome number");
}
else {
	System.out.println(originalnum+" is not a Palindrome number");

}
}
}
