package Abstraction;

public class Test_Class {

	public static void main(String[] args) {
//		AbstractSuperClass abs = new AbstractSuperClass();
//		We Cannot create object for abstract class 
		
		ConcreteSubClass cbs = new ConcreteSubClass();
		cbs.m1();
		cbs.m2();
		cbs.m3();
		cbs.m4();
		cbs.m5();
		System.out.println();
		AbstractSuperClass abs1 = new ConcreteSubClass();
		abs1.m1();
		abs1.m2();
		abs1.m3();
		abs1.m4();
		
	}

}
