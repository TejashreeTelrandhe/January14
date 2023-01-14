package Exception_Handling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
String s = "StringBuffer";
try {
	int num =Integer.parseInt(s);
	System.out.println(num);
}

catch(ArithmeticException e) {
	e.printStackTrace();
	System.out.println(e.getMessage());
}
catch(NullPointerException e1) {
	e1.printStackTrace();
	System.out.println(e1.getMessage());
}
catch(NumberFormatException e2) {
	e2.printStackTrace();
	System.out.println(e2.getMessage());
}
catch(ArrayIndexOutOfBoundsException e3) {
	e3.printStackTrace();
	System.out.println(e3.getMessage());
}
catch(Exception e4) {
	e4.printStackTrace();
	System.out.println(e4.getMessage());
}
finally {
	System.out.println("Finally Block");
}
	}

}
