package Package2;
public class ReverseString {
public static void main(String[] args) {

	String s1 = "Good Morning Sir";
	int len = s1.length();
	String Rev = "";
	for(int i = len-1;i>=0;i--) {
	Rev = Rev + s1.charAt(i);
	}
    System.out.println(Rev);

    String s2 = "Final Finally Finalize";
    int length = s2.length();
    String Reverse = "";
    for (int i = length -1;i>=0;i--) {
    	Reverse=Reverse+ s2.charAt(i);
    }
    System.out.println(Reverse);
    
    String s3 ="if else if control statement";
    int size = s3.length();
    String Rever ="";
    for(int i = size -1;i>=0;i--) {
    	Rever = Rever + s3.charAt(i);
    }
    System.out.println(Rever);
	}
}

