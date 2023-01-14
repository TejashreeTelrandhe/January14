package Package2;

public class ParameterConstructor {
public ParameterConstructor() {//zero parameter
	int i;
	String s;
	System.out.println("Zero input constructor");
}
public ParameterConstructor(int i1,String s1) {//two input parameter
	int i=i1;
	String s=s1;
	System.out.println(i1);
	System.out.println(s1);
}
	public static void main(String[] args) {
		ParameterConstructor P1 = new ParameterConstructor();
		ParameterConstructor P2 = new ParameterConstructor(12,"Om");
		
P1.m1();
P2.m2();
	}
public void m1() {
	System.out.println("Zero input parameter ");
}
public void m2() {
	System.out.println("Two input parameter ");
	
}
}
