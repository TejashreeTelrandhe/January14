package Exception_Handling;

public class Try_Catch_Finally_Block_4 {

	public static void main(String[] args) {
String name = "Prashant";
try {
	int num=Integer.parseInt(name);
	System.out.println(num);
}
catch(NumberFormatException e4){
	e4.printStackTrace();
	System.out.println(e4.getMessage());
}
finally {
	System.out.println("This is finally block");
}
	}

}
