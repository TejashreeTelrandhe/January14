package LogicalPgm_19Dec;

public class String_Palindrome {

	public static void main(String[] args) {
// Palindrome is a string that is same to read from forward and backward direction.
		
		String s ="abcba";
		String rev ="";
		for(int i =s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
		
		String ss= "Scanner";
		String reverse = "";
		for(int j =ss.length()-1;j>=0;j--) {
			reverse = reverse + ss.charAt(j);
		}
		System.out.println(reverse);
	if(ss.equals(reverse)) {
		System.out.println("Second Palindrome String");
	}
	else {
		System.out.println("Second String is not a palindrome");
	}
	}

}
