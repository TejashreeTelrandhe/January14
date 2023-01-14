package Package1;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		// Using New Keyword
		int i[][]=new int [2][2];

		System.out.println(i.length);//Total no of rows

		System.out.println();

		System.out.println(i[1].length);//Total no of columns

		System.out.println();

		//1st row
		i[0][0]=100;
		i[0][1]=200;
		System.out.println(i[0][0]);
		System.out.println();
		//2nd row
		i[1][0]=1000;
		i[1][1]=2000;
		System.out.println(i[1][1]);
		System.out.println();

		for(int row=0;row<i.length;row++) {
			for(int column=0;column<i[1].length;column++) {
				System.out.println(i[row][column]);
			}
		}

	}

}
