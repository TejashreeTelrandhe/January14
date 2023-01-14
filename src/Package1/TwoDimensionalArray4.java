package Package1;

public class TwoDimensionalArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		By String literal
		int num[][]= {{11,11,11,11,11},{12,12,12,12,12},{13,13,13,13,13},{14,14,14,14,14}};
		System.out.println(num.length);//4
		System.out.println();
		System.out.println(num[3].length);//5
		System.out.println();

		System.out.println(num[0][0]);//11
		System.out.println(num[0][1]);//11
		System.out.println(num[0][2]);//11
		System.out.println(num[0][3]);//11
		System.out.println(num[0][4]);//11
		System.out.println();

		System.out.println(num[1][0]);//12
		System.out.println(num[1][1]);//12
		System.out.println(num[1][2]);//12
		System.out.println(num[1][3]);//12
		System.out.println(num[1][4]);//12
		System.out.println();

		System.out.println(num[2][0]);//13
		System.out.println(num[2][1]);//13
		System.out.println(num[2][2]);//13
		System.out.println(num[2][3]);//13
		System.out.println(num[2][4]);//13
		System.out.println();

		System.out.println(num[3][0]);//14
		System.out.println(num[3][1]);//14
		System.out.println(num[3][2]);//14
		System.out.println(num[3][3]);//14
		System.out.println(num[3][4]);//14
		System.out.println();

		for(int i = 0;i<num.length;i++) {//0     //1    //2     //3	
			
			for(int j =0;j<num[0].length;j++) {//0  //1  //2  //3   //4   //5-false
				
				System.out.println(num[i][j]);
			}
		}
		System.out.println("Program excited");

	}

}
