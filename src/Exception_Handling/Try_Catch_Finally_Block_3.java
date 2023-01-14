package Exception_Handling;

public class Try_Catch_Finally_Block_3 {

	public static void main(String[] args) {
int arr []= new int[5];
try {
	System.out.println(arr[6]);
}
catch(ArrayIndexOutOfBoundsException e2) {
	e2.printStackTrace();
	System.out.println(e2.getMessage());
}
finally {
	System.out.println("This is finally block");
}
	}

}
