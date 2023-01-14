package Logical;

public class TotalWhiteSpaces {

	public static void main(String[] args) {
String ss = "aa bb ccdd ee";
int count =0;
for(int i=0;i<ss.length()-1;i++) {
	char s1 = ss.charAt(i);
	if(s1==' ') {
		count++;
	}
}
System.out.println("Total number of counts :"+count);
	}

}
