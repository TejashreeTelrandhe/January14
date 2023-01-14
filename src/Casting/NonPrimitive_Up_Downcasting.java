package Casting;

public class NonPrimitive_Up_Downcasting extends NonPrimitive_Casting{

	public static void main(String[] args) {
		NonPrimitive_Up_Downcasting  npud = new NonPrimitive_Up_Downcasting();//static binding
		npud.method1();
		npud.method2();
		System.out.println();
		
		NonPrimitive_Casting npc = new NonPrimitive_Up_Downcasting();// Dynamic binding & Upcasting
		npc.system1();
		npc.system2();
		npc.system3();
//		Creating object of subclass(NonPrimitive_Up_Downcasting) by using reference of superclass(NonPrimitive_Casting)
	    System.out.println();
	    
	    NonPrimitive_Up_Downcasting npd = (NonPrimitive_Up_Downcasting) new NonPrimitive_Casting();
	    npd.method1();
	    npd.method2();
	    npd.system1();
	    npd.system2();
	    npd.system3();
//		Creating object of superclass(NonPrimitive_Casting) by using reference of subclass(NonPrimitive_Up_Downcasting)
//	    ClassCastException is thrown
	}
	public void method1() {
		System.out.println("Method 1");
	}
	public void method2() {
		System.out.println("Method 2");
	}
}
