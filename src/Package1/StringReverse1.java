package Package1;
public class StringReverse1 {
public static void main(String[] args) {
String ss= "String is immutable";
		int len=ss.length();
		String Reverse ="";
		
		for(int i=len-1;i>=0;i--) {
			Reverse =Reverse+ss.charAt(i);
		}
		System.out.println(Reverse);
		
		System.out.println();
		
		String s1= "String Buffer";
		int length = s1.length();
		String Rev ="";
		for(int i=length-1;i>=0;i--) {
			Rev=Rev+s1.charAt(i);
		}
		System.out.println(Rev);
		
		System.out.println();
		
		String s2 ="Substring is method of String";
		int l=s2.length();
		String Rever="";
		for(int j = l-1;j>=0;j--) {
		Rever=Rever+s2.charAt(j);
	}
		System.out.println(Rever);
		
		System.out.println();
		
		String s3 ="String Control Pool";
		int leng=s3.length();
		String Reverseword="";
		for(int j =leng-1;j>=0;j--) {
			Reverseword =Reverseword +s3.charAt(j);
		}
		System.out.println(Reverseword);
	}
}
