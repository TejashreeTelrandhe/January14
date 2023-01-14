package Exception_Handling;

public class Try_Catch_Finally_Block_2 {

	public static void main(String[] args) {
		
		String name =null;
		try {
	    	System.out.println(name.length());
	    }
	    catch(NullPointerException e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
	    finally {
	    	System.out.println("This is the finally block");
	}

	}

}
