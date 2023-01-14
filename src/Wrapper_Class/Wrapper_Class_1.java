package Wrapper_Class;

public class Wrapper_Class_1 {
//	The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
	
//	Autoboxing: The automatic conversion of primitive into an object is known as autoboxing.
//	example, byte to Byte, char to Character, int to Integer, long to Long, float to Float,
//	boolean to Boolean, double to Double, and short to Short.
	
//	Unboxing: The automatic conversion of object into an primitive is known as unboxing.
	
//	The different scenarios, where we need to use the wrapper classes.
//	Change the value in Method: Java supports only call by value. So, if we pass a primitive value,
//	it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.
//	Serialization: We need to convert the objects into streams to perform the serialization. 
//	If we have a primitive value, we can convert it in objects through the wrapper classes.
//	Synchronization: Java synchronization works with objects in Multithreading.
//	java.util package: The java.util package provides the utility classes to deal with objects.
//	Collection Framework: Java collection framework works with objects only. All classes of the 
//	collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue,
//	ArrayDeque, etc.) deal with objects only.

	public static void main(String[] args) {
int a = 10;
System.out.println("DataType : "+a);

Integer b = 13;
System.out.println("Wrapper Class : "+b.intValue());
	}

}
