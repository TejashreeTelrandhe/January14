package Package2;
public class ReverseEachWordString1 {
public static void main(String[] args) {
	String ss = "Structured Query Language";
	String RevString = "";
	String word [] = ss.split(" ");
	for(String W : word) {
	String Reverseword ="";
	for(int i = W.length()-1;i>=0;i--) {
	Reverseword = Reverseword + W.charAt(i);
	}
	RevString = RevString +Reverseword +" ";
    }
	System.out.println(RevString);
	
	String st = "Data Manipulation Language";
	String RevStrings= "";
	String line []=st.split(" ");
	for(String L: line) {
	String RevWords ="";
	for(int i =L.length()-1;i>=0;i--) {
	RevWords = RevWords +L.charAt(i);
	}
	RevStrings =RevStrings +RevWords +" ";
	}
	System.out.println(RevStrings);
	
}
}



