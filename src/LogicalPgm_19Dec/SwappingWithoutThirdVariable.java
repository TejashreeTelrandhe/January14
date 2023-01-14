package LogicalPgm_19Dec;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
    int a = 45;
    int b = 55;
     
	System.out.println("Before swapping numbers a = " + a + " and b = " + b);
	
	a= a+b; // a=45+55 = 100
	b= a-b; // b=100-55 = 45
	a= a-b; // a=100-45 = 55
	
	System.out.println("After swapping numbers a = " + a + " and b = " + b);
	}

}
