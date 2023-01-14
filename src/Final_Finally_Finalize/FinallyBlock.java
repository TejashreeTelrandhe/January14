package Final_Finally_Finalize;

public class FinallyBlock {

	public static void main(String[] args) {
		String word = "Tejashree";
		try {
		System.out.println(Integer.parseInt(word));
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block exceuted successfully");
		}
//		Finally - Finally is a block in java exception handling to execute the important code 
//		 weather the exception occurs or not.
	}

}
