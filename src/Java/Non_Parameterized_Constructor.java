package Java;

public class Non_Parameterized_Constructor {
	static int a=145;
	public Non_Parameterized_Constructor() {
	System.out.println("Parameterized_Constructor");
	}
	
		public static void main(String[] args) {
		System.out.println("Main method started");	
		Non_Parameterized_Constructor npc = new Non_Parameterized_Constructor();
		npc.test();
		System.out.println("Main method ended");	
		}
		public void test(){
		System.out.println(a);
		System.out.println("running test method");
		}
}
