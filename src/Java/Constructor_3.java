package Java;


public class Constructor_3 {
	int num;
	int num1;
	String name;

	public Constructor_3() { //Without parameter
	
	num=10;
	num1 =20;

	}                            
	public Constructor_3(int num3, int num4) { //With parameter  
		
		num=num3;
		num1=num4;
		
		int add = num+num1;
		System.out.println("With two input parameter:"+add);
	}

	public void add() {
		
		int add=num+num1;
		System.out.println("Without input parameter:"+add);
	}
	public static void main(String[] args) {

	 Constructor_3 UD1 = new Constructor_3();  
	 UD1.add();
	 Constructor_3 UD2 = new Constructor_3(14,10);

	}
}
