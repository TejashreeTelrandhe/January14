package LogicalPgm_19Dec;

public class White_Spaces {

public static void main(String[] args) {
String s="ab cd e f gh ij kl";
int count =0;
for(int i=0;i<s.length();i++) {
	char s1 = s.charAt(i);
	if (s1==' ') {
		count++;
}
}
System.out.println("No of spaces in string : "+count);
}
}
