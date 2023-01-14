package Package1;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
//		By using new keyword
String s[][]=new String [5][6];

System.out.println(s.length);//Total no of rows

System.out.println();

System.out.println(s[0].length);//Total no of columns

System.out.println();

//  1st row
s[0][0]="K1";
s[0][1]="K2";
s[0][2]="K3";
s[0][3]="K4";
s[0][4]="K5";	
s[0][5]="K6";
System.out.println(s[0][0]);

//2nd row
s[1][0]="L1";
s[1][1]="L2";
s[1][2]="L3";
s[1][3]="L4";
s[1][4]="L5";	
s[1][5]="L6";
System.out.println(s[1][1]);	

//3rd row
s[2][0]="M1";
s[2][1]="M2";
s[2][2]="M3";
s[2][3]="M4";
s[2][4]="M5";	
s[2][5]="M6";
System.out.println(s[2][2]);

//4th row
s[3][0]="N1";
s[3][1]="N2";
s[3][2]="N3";
s[3][3]="N4";
s[3][4]="N5";	
s[3][5]="N6";
System.out.println(s[3][3]);

//5th row
s[4][0]="O1";
s[4][1]="O2";
s[4][2]="O3";
s[4][3]="O4";
s[4][4]="O5";	
s[4][5]="O6";
System.out.println(s[4][4]);
System.out.println();

	for(int i =0;i<s.length;i++) {
		for(int j=0;j<s[0].length;j++ ) {
			System.out.println(s[i][j]);
		}
	}

	}

}
