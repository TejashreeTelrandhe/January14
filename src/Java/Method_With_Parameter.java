package Java;

public class Method_With_Parameter {
	public static void main(String[] args)
	{
		Non_Static_Method_1SC SC = new Non_Static_Method_1SC();
	
		SC.method2("Java");
		SC.method3("OOPs", 0);
		SC.method4("Principle", 10, false);
		System.out.println();
		
		Non_Static_Method_1DC DC = new Non_Static_Method_1DC();
		
		DC.method7('J');
	}
}
