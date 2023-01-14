package String;

public class String_Reverse {
public static void main(String[] args) {
	String word ="Knowledge";
	String rev="";
	int length = word.length();
	
	for(int i =length-1;i>=0;i--) {
		rev = rev +word.charAt(i);
	}
	System.out.println(rev);
	
	
	String s1 = "Automatic Promotion";
	String reverse ="";
	int len = s1.length();
	for(int j=len-1;j>=0;j--) {
   reverse= reverse+s1.charAt(j);
	}
	System.out.println(reverse);

	
	String s2 ="Webdriver driver";
	for(int k=s2.length()-1;k>=0;k--) {
		System.out.print(s2.charAt(k));
	}
	System.out.println();
	
	String s3 ="Select By Visibility Text";
	for(int m=s3.length()-1;m>=0;m--) {
		System.out.print(s3.charAt(m));
	}
}
}
