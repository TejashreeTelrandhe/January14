package Exception_Handling;
//  The Exception Handling in Java is one of the powerful mechanism to handle the runtime
//  errors so that the normal flow of the application can be maintained.

//  The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by
//  two subclasses: Exception and Error.
//  A. Exception                                    B. Error
//   1. IOException                                    1.  StackOverflowError
//   2. SQLException                                   2.  VirtualMachineError
//   3. ClassNotFoundException                         3.  OutOfMemoryError
//   4. RuntimeException
//     a. ArithmeticException
//     b. NullPointerException
//     c. NumberFormatException
//     d. IndexOutOfBoundException
//         i. ArrayIndexOutOfBoundException
//         ii. StringIndexOutOfBoundException

public class Unchecked_Exception {
//	Unchecked Exception: An error is considered as the unchecked exception.
//  The classes that inherit the RuntimeException are known as unchecked exceptions. 
//	For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
//	Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

	public static void main(String[] args) {
		System.out.println("Exception");
		int i = 10;
//  System.out.println(i/0);//ArithmeticException
//  If we divide any number by zero, there occurs an ArithmeticException.

		String name = null;
//  System.out.println(name.length());//NullPointerException
//  If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.

		String s1 = "Unchecked";
//  int num = Integer.parseInt(s1);
//  System.out.println(num);//NumberFormatException
//  If the formatting of any variable or number is mismatched, it may result into NumberFormatException. 
//  Suppose we have a string variable that has characters; converting this variable into digit will cause
//  NumberFormatException.

		int arr[] = new int[4];
		arr[6] = 45;
		System.out.println(arr[6]);// ArrayIndexOutOfBoundException
//  When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. 

//	Checked Exception: The classes that directly inherit the Throwable class except RuntimeException 
//  and Error are known as checked exceptions. For example, IOException, SQLException, etc.
//  Checked exceptions are checked at compile-time.

//  Error: Error is irrecoverable. Some example of errors are OutOfMemoryError, 
//  VirtualMachineError, AssertionError etc.
	}
}
