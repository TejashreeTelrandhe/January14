package Abstraction;

public class Concrete_Constructor extends Abstract_Constructor{
public Concrete_Constructor() {
	super();
	System.out.println("Concrete_Constructor");
	System.out.println("Constructor called from abstract class");
}
public static void main(String[] args) {
	Concrete_Constructor cc = new Concrete_Constructor();
}
}
