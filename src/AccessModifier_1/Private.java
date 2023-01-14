package AccessModifier_1;

public class Private {
private String bank ="HDFC";
	public static void main(String[] args) {
		Private p2 = new Private();
		System.out.println(p2.bank);
		p2.nameofbank();
	}
private void nameofbank() {
	System.out.println("private access modifer");
}
}
