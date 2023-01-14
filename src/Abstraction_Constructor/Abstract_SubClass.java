package Abstraction_Constructor;

public class Abstract_SubClass extends Abstract_SuperClass{
public Abstract_SubClass() {
	super();
//	super(25);// constructor private cannot be called in other class
}
	public static void main(String[] args) {
//		Abstract_SuperClass asc1 = new Abstract_SuperClass();
//		Cannot create object for abstract class.
		Abstract_SubClass asc = new Abstract_SubClass();
		
	}

}
