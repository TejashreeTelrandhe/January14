package Final_Finally_Finalize;

public class FinalKeyword {
final int a=102;
//a =103; // cannot reassign the value to variable if declared final

	public static void main(String[] args) {
		int c = 100;
		System.out.println(c);
		c =101;
		System.out.println(c);
		final int a=102;
		//a =103; // cannot reassign the value to variable if declared final
        System.out.println(a);
        FinalKeyword fk = new FinalKeyword();
        fk.finalmethod1();
	}
public final void finalmethod1() {
	System.out.println("Final Method");
}
//Cannot override the final method in childclass
}
