package Abstraction_Constructor;

public abstract class Abstract_SuperClass {
public Abstract_SuperClass() {
	this(200);
	System.out.println("Abstract_SuperClass Public Constructor");
}
private Abstract_SuperClass(int j) {
	System.out.println("Abstract_SuperClass Private Constructor");
}

}
