package Polymorphism;

public class TestClass_RTP {
public static void main(String[] args) {
	SuperClass_RTP sc1 = new SuperClass_RTP(); //static binding
	sc1.python();
	sc1.javascript();
	sc1.ruby();
	
	SubClass_RTP sc2 = new SubClass_RTP(); // static binding
	sc2.python();
	sc2.ruby();
	sc2.javascript();
	sc2.csharp();
	System.out.println();
	
	SuperClass_RTP sc3 = new SubClass_RTP(); //dynamic binding & UpCasting
	sc3.javascript();
	sc3.python();
	sc3.ruby();
//	sc3.csharp();
	System.out.println();
	
//	SubClass_RTP s4 = (SubClass_RTP) new SuperClass_RTP(); // DownCasting 
//	s4.csharp();
//	s4.javascript();
//	s4.python();
//	s4.ruby();
	
//	ClassCastException : ClassCastException is a runtime exception raised in Java when we try to improperly 
//	cast a class from one type to another.It's thrown to indicate that the code has attempted to cast 
//	an object to a related class, but of which it is not an instance.
	
	Static_Super_Class s5 = new Static_Super_Class();
	s5.desktop();//Window desktop
	s5.mobile();//Windows mobile 

	
	Static_Sub_Class s6 = new Static_Sub_Class();
	s6.desktop();  // Desktop application
	s6.mobile();   // Mobile application
	s6.linux();    // Linux is the operating system
	
	Static_Super_Class s7 = new Static_Sub_Class();
    s7.desktop();  // Window desktop instead of Desktop application
    s7.mobile();   // Windows mobile  instead of Mobile application
//  s7.linux();
//  Static method cannot be override due to method hiding concept 
//  If we override the static method it is not allowed but we can hide the method by creating 
//	object of subclass and using reference variable name of superclass.
}
}
