package Logical;

public class StringPalindrome {

	public static void main(String[] args) {
//String P = "forevereverof";
String P = "Arrayarr";
String rev="";

for(int i =P.length()-1;i>=0;i--) {
	rev=rev+P.charAt(i);
}

System.out.println(rev);

if(P.equals(rev)) {
	System.out.println("A Palindrome");
}
else {
	System.out.println("Not a Palindrome");
}
}

}
