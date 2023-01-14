package String;

public class String_Each_Reverse {

public static void main(String[] args) {
String s1 = "It is used to read the input of primitive types like int, double,long.";

String arr [] =s1.split(" ");
String RevString ="";
for(String W:arr) {
String RevWord ="";
for(int i=W.length()-1;i>=0;i--) {
	RevWord= RevWord+W.charAt(i);
}
RevString = RevString+RevWord+" ";
}
System.out.println(RevString);

System.out.println();

String s2 = "It belongs to java.util package";
String array []= s2.split(" ");
	String revstring ="";
	for(String ww : array) {
	String revword="";
	for(int i = ww.length()-1;i>=0;i--) {
		revword=revword+ww.charAt(i);
	}
	revstring = revstring+revword+" ";
	}
	System.out.println(revstring);
	
	System.out.println();
	
String s3 ="Scanner scan = new Scanner(System.in)";
String arrays []=s3.split(" ");
String revw="";
String revs="";
for(String www:arrays) {
	for(int i = www.length()-1;i>=0;i--) {
		revw=revw+www.charAt(i);
	}
	revs=revs+revw+" ";
}
System.out.println(revs);
	}
}
