package Package2;

public class ReverseEachWordString2 {
public static void main(String[] args) {

		String s1 = "Constrains and joins";
		String RString ="";
		String arr []= s1.split(" ");
		for( String Para :arr) {
		String Rword ="";
		for(int i = Para.length()-1;i>=0;i--) {
		RString =RString +Para.charAt(i);
		}
		RString = RString +Rword +" ";
		}
		System.out.println(RString);
		
		System.out.println();
		
		String s2 = "Object Oriented Programming Language";
		String ReverseString ="";
		String array []= s2.split(" ");
		for(String Line : array) {
		String StringWord ="";
		for(int i = Line.length()-1;i>=0;i--) {
		StringWord = StringWord +Line.charAt(i);	
		}
		ReverseString = ReverseString + StringWord +" ";
		}
		System.out.println(ReverseString);

}
}