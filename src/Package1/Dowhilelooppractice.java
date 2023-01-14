package Package1;

public class Dowhilelooppractice {

	public static void main(String[] args) {
//		WAP to print even numbers from 20 to 0
		int i = 20;
		do {
			System.out.println(i);
			i=i-2;
		}
		while(i>=0);
		System.out.println();
		
//		WAP to print odd numbers from 150  to 170
		int n = 149;
		do {
			System.out.println(n);
			n=n+2;
		}
		while(n<=170);
		System.out.println();
		
//		WAP for infinite do while loop
		do {
			System.out.println("Infinite do while loop");
		}
		while(false);
		System.out.println();
		
//		do {
//			System.out.println("Infinite do while loop");
//		}
//		while(true);
	}

	
}
