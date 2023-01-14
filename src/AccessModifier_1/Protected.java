package AccessModifier_1;

public class Protected {
	protected double interest =  7.5;
	public static void main(String[] args) {
		Protected p4 = new Protected();
		System.out.println(p4.interest);
		p4.loanpolicy();
	}
protected void loanpolicy() {
	System.out.println("Protected access specifier");
}
}
