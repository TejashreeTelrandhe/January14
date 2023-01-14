package LogicalPgm_19Dec;

public class Left_Triangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { //i=1 //i=1+1=2  //i=2+1=3
			for (int j = 1; j <= i; j++) {//j=1                   // *
				                          //j=1,j=1+1=2           // **
				                          //j=1,j=1+1=2, j=2+1=3  // ***
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// *
// 