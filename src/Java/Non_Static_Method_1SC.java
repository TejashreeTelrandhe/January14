package Java;

public class Non_Static_Method_1SC {

	public static void main(String[] args) {
		Non_Static_Method_1SC SC = new Non_Static_Method_1SC();
		SC.method1();
		SC.method2("Java");
		SC.method3("OOPs", 0);
		SC.method4("Principle", 10, false);
	}
		public void method1() {
			System.out.println("Method 1");
			}

		public void method2(String s) {
			System.out.println("Method 2");
			s="SameClass";
			System.out.println("String = "+s);
		}

		public void method3(String s1, int i1) {
			System.out.println("Method 3");
			s1="Static";
			i1= 1;
			System.out.println("String = "+s1+" ,Integer = "+i1);
		}

		public void method4(String s2, int i2, boolean b) {
			System.out.println("Method 4");
			s2="MainMethod";
			i2= 2;
			b= true;
			System.out.println("String = "+s2+" ,Integer = "+i2+" ,Boolean = "+b);
		}
	}

