package AccessModifier_1;

public class Public {
public int accountbalance = 1500 ;
	public static void main(String[] args) {
		Public p1 = new Public();
		System.out.println(p1.accountbalance);
		p1.balance();
	}
public void balance() {
	System.out.println("public access modifier");
}
}
