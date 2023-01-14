package Package1;

public class PublicAMpractice {
public String s ="Imran";
	public static void main(String[] args) {
		PublicAMpractice P = new PublicAMpractice();
		System.out.println(P.s);
		P.m1();
	}
public void m1() {
	System.out.println("Public Access Modifier practice");
}
}
