package Inheritance_OOPs;

public class Inheritance_TestClass {

	public static void main(String[] args) {
		SingleLevel_SuperClass s1 = new SingleLevel_SuperClass();
		s1.pen();
		s1.pencil();
		s1.eraser();
		
		SingleLevel_SubClass s2 = new SingleLevel_SubClass();
		s2.pen();
		s2.pencil();
		s2.eraser();
		s2.ruler();
		s2.compass();
		
		MultiLevel_Class1  s3 = new MultiLevel_Class1();
		s3.array();
		s3.collection();
		s3.string();
		
		MultiLevel_Class2 s4 = new MultiLevel_Class2();
		s4.array();
		s4.collection();
		s4.string();
		s4.list();
		s4.queue();
		s4.set();
		
		MultiLevel_Class3 s5 = new MultiLevel_Class3();
        s5.array();
        s5.collection();
        s5.arraylist();
        s5.queue();
        s5.set();
        s5.linkedlist();
        s5.list();
        s5.vector();
        s5.string();
        
        Hierarchial_SuperClass s6 = new Hierarchial_SuperClass();
        s6.remotewebdriver();
        s6.searchcontext();
        s6.webdriver();
        
        Hierarchial_SubClass1 s7 = new Hierarchial_SubClass1();
        s7.remotewebdriver();
        s7.searchcontext();
        s7.webdriver();
        s7.chrome();
        s7.edge();
        
        Hierarchial_SubClass2 s8 = new Hierarchial_SubClass2();
        s8.searchcontext();
        s8.remotewebdriver();
        s8.internetexplorer();
        s8.firefox();
        s8.safari();
        s8.webdriver();
	}

}
