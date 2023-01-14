package Logical;

public class ReverseString {
public static void main(String[] args) {
	String ss ="Tejashree";
	
	String rev = "";
	
	for(int i =ss.length()-1;i>=0;i--) {
		
	rev=rev+ss.charAt(i);
	
	}
	System.out.println(rev);
	
}

}
