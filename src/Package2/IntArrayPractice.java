package Package2;

import java.util.Arrays;

public class IntArrayPractice {

	public static void main(String[] args) {
int arr [] = new int [7];
arr[0]=1;
arr[1]=15;
arr[2]=125;
arr[3]=20;
arr[4]=55;
arr[5]=100;
arr[6]=96;
System.out.println(arr.length);
System.out.println("Elements in the array: ");
for(int i = 0; i<arr.length;i++) {
	System.out.print(arr[i]+"   ");
}
System.out.println();
System.out.println("Sorted Elements in the array: ");
Arrays.sort(arr);
for(int i = 0 ; i<arr.length;i++) {
	System.out.print(arr[i]+"   ");
}






	}

}
