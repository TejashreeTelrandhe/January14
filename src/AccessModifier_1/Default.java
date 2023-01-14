package AccessModifier_1;

public class Default {
char grade ='A';
	public static void main(String[] args) {
		Default p3 = new Default();
		System.out.println(p3.grade);
		p3.gradation();
	}
void gradation() {
	System.out.println("Default access modifier");
}
}
