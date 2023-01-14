package Package1;

public class StarPatttern3 {

	public static void main(String[] args) {
for(int i =1;i<=5;i++) {// 1 , 2
	
	for(int j =1;j<=5;j++) {//1  ,2
		
		if(j>=6-i) {//5   ,4,5
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
