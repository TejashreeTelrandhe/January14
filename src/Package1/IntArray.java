package Package1;
import java.util.Arrays;
public class IntArray {

	public static void main(String[] args) {
		//Array declaration
		int arr[]= new int[11];
		arr[0]=10;
		arr[1]=50;
		arr[2]=40;
		arr[3]=20;
		arr[4]=30;
		arr[5]=70;
		arr[6]=60;
		arr[7]=110;
		arr[8]=100;
		arr[9]=90;
		arr[10]=80;
        System.out.println(arr[6]);
		System.out.println(arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+"    ");
		}
		System.out.println();
	    Arrays.sort(arr);
	    for(int i = 0;i<arr.length;i++) {
	    	System.out.print(arr[i]+"    ");
	    }
		System.out.println();
	}
}
