package Package1;

public class StarPatttern2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//1 , 2
			
			for(int j =1; j<=5;j++) {//1  , 2  ,3  ,4  ,5 ,6
				
				if(j<=i) { //1<=2   2<= 2  3<=2  4<=2   5<=2
					
					System.out.print("*");
				}
			else {
			System.out.print(" ");
		}
		}
			System.out.println();
		}
	}

}
