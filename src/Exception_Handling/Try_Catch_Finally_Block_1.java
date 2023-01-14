package Exception_Handling;

public class Try_Catch_Finally_Block_1 {

	public static void main(String[] args) {
	int i =10;
	try {
    	System.out.println(i/0);
    }
    catch (ArithmeticException e) {
    	e.printStackTrace();
    	System.out.println(e.getMessage());
    }
	finally {
    	System.out.println("This is the finally block");
}
}
}
