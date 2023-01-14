package Package2;

public class StingArrayTwoDiPractice1 {

	public static void main(String[] args) {
	String s [][] = new String [3][5];
	
	s[0][0]= "P1";
	s[0][1]= "P2";
	s[0][2]= "P3";
	s[0][3]= "P4";
	s[0][4]= "P5";
	
	s[1][0]= "Q1";
	s[1][1]= "Q2";
	s[1][2]= "Q3";
	s[1][3]= "Q4";
	s[1][4]= "Q5";
	
	s[2][0]= "R1";
	s[2][1]= "R2";
	s[2][2]= "R3";
	s[2][3]= "R4";
	s[2][4]= "R5";
	
	System.out.println(s.length);//3
	System.out.println(s[0].length);//5
	for(int i=0;i<s.length;i++) {
		for(int j=0;j<s[0].length;j++) {
			System.out.print(s[i][j]+"     ");
		}
		System.out.println();
	}
	
	}

}
