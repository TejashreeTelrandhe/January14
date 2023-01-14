package Exception_Handling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemory_Error {

	public static void main(String[] args) {
try{List randomlist = new ArrayList();
Random r = new Random();
while(true){
	randomlist.add(r.nextInt());
}
//	An error is thrown by the Java Virtual Machine when it finds that not enough 
//	memory is left for storing the object in the heap space, and as a result, the 
//	JVM throws an error that it is unable to allocate the object because no more 
//	space is left for storing it.
}
catch(OutOfMemoryError e) {
	e.printStackTrace();
	System.out.println(e.getMessage());
}
finally {
	System.out.println("Finally block");
}
	}
}
