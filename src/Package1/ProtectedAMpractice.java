package Package1;

public class ProtectedAMpractice {
protected char c='A';
	public static void main(String[] args) {
		ProtectedAMpractice P2= new ProtectedAMpractice();
		System.out.println(P2.c);
		P2.m3();
	}	
	protected void m3() {
	System.out.println("Protected Access Modifier practice");
}
}
