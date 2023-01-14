package Java;

public class Variables_Datatype_1 {

public static void main(String[] args) {

		byte b1= -128;
		byte b2= 127;
		System.out.println("Byte min limit "+b1);
		System.out.println("Byte max limit "+b2);

		short s1= -32768;
		short s2= 32767;
		System.out.println("Short min limit "+s1);
		System.out.println("Short max limit "+s2);
		
		int i1 = -2147483648 ;
		int i2 = 2147483647;
		System.out.println("Int min limit "+i1);
		System.out.println("Int max limit "+i2);

		long l1= - 9223372036854775808l;
		long l2= 9223372036854775807l;
		System.out.println("Long min limit "+l1);
		System.out.println("Long max limit "+l2);
		
		float f1 = 45.26f;
		float f2 = -96.23f;
		System.out.println("Float min limit "+f1);
		System.out.println("Float max limit "+f2);

		
		double d1 = 586.15;
		double d2 = -78.1224444444444444457;
		System.out.println("Double min limit "+d1);
		System.out.println("Double max limit "+d2);

		char c1 ='A';
		char c2 ='T';
		System.out.println("Char min limit "+c1);
		System.out.println("Char max limit "+c2);

		boolean bb1 = true;
		boolean bb2 = false;
		System.out.println("Boolean min limit "+bb1);
		System.out.println("Boolean max limit "+bb2);

	}

}
