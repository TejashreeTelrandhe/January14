package Abstraction;

public class Abstract_Constructor {
public Abstract_Constructor() {
	this(10);
	System.out.println("Abstract_Constructor non parameterised");
	
}
private Abstract_Constructor(int i ) {
	System.out.println("Abstract_Constructor parameterised");
}
}
