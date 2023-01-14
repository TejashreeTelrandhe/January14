package Package1;

public class StringReverseEachWord1 {

	public static void main(String[] args) {
String s1 = "Welcome to selenium webdriver";
String RevString="";
String word []=s1.split(" ");

for(String S : word) {
	System.out.println(S);
	String RevWord ="";
	for(int i=S.length()-1;i>=0;i--) {
		RevWord=RevWord+S.charAt(i);
	}
 RevString =RevString+RevWord+" ";
}
System.out.println(RevString);

System.out.println();

String s2 = "ArrayList is growable in nature";
String Reverse="";
String words []=s2.split(" ");

for(String W: words) {
	System.out.println(W);
	String Rev ="";
	for(int j=W.length()-1;j>=0;j--) {
		Rev=Rev+W.charAt(j);
	}
	Reverse =Reverse +Rev+" ";
}
System.out.println(Reverse);

System.out.println();

String s3 ="Default size of ArrayList is 10";
String ReverseString="";
String eachword []=s3.split(" ");

for(String SS : eachword) {
	System.out.println(SS);
	String ReverseWord="";
	for(int k=SS.length()-1;k>=0;k--) {
		ReverseWord =ReverseWord +SS.charAt(k);
	}
	ReverseString=ReverseString +ReverseWord+" ";
}
System.out.println(ReverseString);
	}

}
