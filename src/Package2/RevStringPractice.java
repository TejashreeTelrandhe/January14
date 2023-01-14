package Package2;

public class RevStringPractice {

	public static void main(String[] args) {
		String s11= "My name is tejashree";
		int length = s11.length();
	    String Reverse = "";
	    for(int j =length-1; j>=0;j--) {
	    Reverse = Reverse + s11.charAt(j) ;
	    }
	    System.out.println(Reverse);
		}
	}


