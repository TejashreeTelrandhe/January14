package LogicalPgm_19Dec;

public class Object_Count {
	// variable to keep track of objects
	public static int count;

	// constructor of the class
	public Object_Count() {
		// increase the count variable by 1
		count++;
	}

	public static void main(String args[]) {
		// creating objects
		Object_Count ob1 = new Object_Count();
		Object_Count ob2 = new Object_Count();
		Object_Count ob3 = new Object_Count();
		Object_Count ob4 = new Object_Count();
		Object_Count ob5 = new Object_Count();
		// prints number of objects
		System.out.print("Total Number of Objects: " + Object_Count.count);
	}
}
