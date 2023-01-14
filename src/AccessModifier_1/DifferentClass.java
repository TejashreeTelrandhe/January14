package AccessModifier_1;

public class DifferentClass {

	public static void main(String[] args) {
		Public p1 = new Public();
		System.out.println(p1.accountbalance);
        p1.balance();
	
//        Private p2 = new Private();
//		System.out.println(p2.bank);
//		p2.nameofbank();
	
        Default p3 = new Default();
		System.out.println(p3.grade);
		p3.gradation();
		
		Protected p4 = new Protected();
		System.out.println(p4.interest);
		p4.loanpolicy();
	}

}
