package Package2;

public class MaxMinArrayPractice {

	public static void main(String[] args) {
int arr []= {23,45,78,98,65,32,10,231,123,898};
System.out.println(arr.length);
int max=arr[0];
System.out.println("Max number : ");
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
}
System.out.println(max);
System.out.println();

int min=arr[0];
System.out.println("Min number : ");
for(int i =0;i<arr.length;i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
}
System.out.println(min);
	}
}
