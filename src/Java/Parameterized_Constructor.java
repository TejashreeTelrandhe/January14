package Java;

public class Parameterized_Constructor {

public Parameterized_Constructor(int i) {
	System.out.println("int input parameter");
}
public Parameterized_Constructor(int j, String s) {
	System.out.println("int and string input parameter");
	}
public Parameterized_Constructor(char c) {
	System.out.println("char input parameter");
	}
public static void main(String[] args) {
	Parameterized_Constructor pc = new Parameterized_Constructor(0);
	Parameterized_Constructor pcm = new Parameterized_Constructor(1);
	Parameterized_Constructor pcb = new Parameterized_Constructor('A');
	pc.m1();
	pc.m2("javascript");
	pcm.m3();
	pcb.m4();
}
public void m1() {
	System.out.println("method 1");
}
public void m2(String s) {
	System.out.println("method 2");
}
public void m3() {
	System.out.println("method 3");
}
public void m4() {
	System.out.println("method 4");
}
}
