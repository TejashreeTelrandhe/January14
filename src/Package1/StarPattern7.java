package Package1;

public class StarPattern7 {

	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {//row
			for(int j =1;j<=5;j++) {//column
				if(j>=6-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
for(int i =1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(j>=6-i) {
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
