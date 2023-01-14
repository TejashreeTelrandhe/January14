package Package1;

public class TwoDimensionalArray {

	public static void main(String[] args) {
int arr[][]= {{1,2,3,4,5},{11,12,13,14,15}};
System.out.println(arr.length);
System.out.println(arr[0].length);
System.out.println();
for(int i =0;i<arr.length;i++) {
	for(int j =0;j<arr[0].length;j++) {
		System.out.print(arr[i][j]+"  ");
	}
}
	}

}
