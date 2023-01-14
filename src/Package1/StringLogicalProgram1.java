package Package1;

public class StringLogicalProgram1 {
	
public static void main(String[] args) {
	
String s ="Awakening is not changing who you are, but discarding who you are not.";

String arr[]=s.split(" ");

int count =0;

for(int i=0;i<arr.length;i++) {String word =arr[i];

for(int j=0;j<word.length();j++) {
	
	if(word.charAt(0)=='c'||word.charAt(0)=='C') {
		count++;
		}
	word="";
	}
}
System.out.println(count);
}
}