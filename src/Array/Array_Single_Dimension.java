package Array;

public class Array_Single_Dimension {

public static void main(String[] args) {
int arr []= new int [5];
arr[0]=100;
arr[1]=200;
arr[2]=300;
arr[3]=400;
arr[4]=500;
for(int i =0;i<=arr.length-1;i++) {
System.out.println(arr[i]);
	}
System.out.println();
int array []= {10,20,30,40,50};
for(int j=0;j<=array.length-1;j++) {
	System.out.println(array[j]);
}
System.out.println();
// Reverse array
System.out.println("Reverse array");
for(int j = arr.length-1;j>=0;j--) {
	System.out.println(array[j]);
}

}
}
