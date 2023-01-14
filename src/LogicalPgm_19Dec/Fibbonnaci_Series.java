package LogicalPgm_19Dec;

public class Fibbonnaci_Series {

	public static void main(String[] args) {
//		In fibonacci series, next number is the sum of previous two numbers. For example 
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

		int a = -1;
		int b = 1;
		int c;
		for (int i = 0; i <= 10; i++) { // i= 0 // i++ = i+1 =0+1 = 1 // i++ = 1+1= 2 // i++ = 2+1 = 3 // i++ = 3+1 = 4
			// i ++ = 4+1 = 5  // i++ = 5+1 = 6  // i++ = 6+1 =7  // i++ = 7+1 = 8 // i++ = 8+1 = 9 // i++ = 9+1 = 10
			c = a + b; // -1+1=0
			// 1+0 = 1
			// 0+1 = 1
			// 1+1 = 2
			// 2+1 = 3
			// 2+3 = 5
			// 3+5 = 8
			// 5+8 = 13
			// 8+13 = 21
			// 13+21 = 34
			// 21+34 = 55
			System.out.print(c + ", "); // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
			a = b; // a = 1 //a = 0 // a = 1 // a = 1 // a = 2 // a = 3 // a = 5 // a = 8 // a = 13  // a = 21 // a = 34
			b = c; // b = 0 //b = 1 // b = 1 // b = 2 // b = 3 // b = 5 // b = 8 // b = 13 // b = 21 // b = 34 // b = 55

		}
	}
}
