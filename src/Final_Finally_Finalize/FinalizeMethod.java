package Final_Finally_Finalize;

public class FinalizeMethod {

	public static void main(String[] args) {
		FinalizeMethod fm = new FinalizeMethod();
		fm.test1();
//		fm.finalize();
		fm = null;
		System.gc();
//		Runs the garbage collector in the Java Virtual Machine. 
//      Calling the gc method suggests that the Java Virtual Machine expend effort toward 
//      recycling unused objects in order to make the memory they currently occupy available
//      for reuse by the Java Virtual Machine.
	}
public void test1() {
	System.out.println("Non finalize method");
}
public void finalize() {
	System.out.println("finalize method");
}
// finalize method:Called by the garbage collector on an object when garbage 
//collection determines that there are no more references to the object.A subclass
//overrides the finalize method to dispose of system resources or to perform other
// cleanup. 
}
