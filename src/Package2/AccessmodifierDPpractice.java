package Package2;

import Package1.ProtectedAMpractice;
import Package1.DefaultAMpractice;
import Package1.PrivateAMpractice;
import Package1.PublicAMpractice;

public class AccessmodifierDPpractice {

	public static void main(String[] args) {
			PublicAMpractice P = new PublicAMpractice();
			System.out.println(P.s);
			P.m1();
			
//			PrivateAMpractice P1= new PrivateAMpractice();
//			System.out.println(P1.age);
//			P1.m2();
			
//			ProtectedAMpractice P2= new ProtectedAMpractice();
//			System.out.println(P2.c);
//			P2.m3();
			
//			DefaultAMpractice P3 = new DefaultAMpractice ();
//			System.out.println(P3.percentage);
//	        P3.m4();
	}

}
