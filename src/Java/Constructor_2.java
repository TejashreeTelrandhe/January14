package Java;

public class Constructor_2 {
int a ;
int b ;
public Constructor_2() {
	a=20;
	b=15;
}
	public static void main(String[] args) {
	Constructor_2 c = new Constructor_2();
	c.add();
	c.sub();
	c.mul();
	c.div();	
	}
public void add() {
	System.out.println("add="+a+b);
}
public void sub() {
	System.out.println("sub="+(a-b));
}
public void mul() {
	System.out.println("mul="+(a*b));
}
public void div() {
	System.out.println("div="+(a/b));
}
}
