package LogicalPgm_19Dec;

public class StringReverse {

	public static void main(String[] args) {
String s="Operating System";
System.out.println("Reverse String : ");
for(int i=s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i));
}
System.out.println();

System.out.println("Original String : ");
for(int j=0;j<s.length();j++) {
	System.out.print(s.charAt(j));
}
	}

}
