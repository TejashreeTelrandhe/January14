package Logical;

public class DuplicateNumber {

	public static void main(String[] args) {
int arr []= {1,2,3,4,5,6,7,8,9,2,3,45,5,6};
System.out.println(arr.length);
System.out.println("Duplicate numbers in the given array are : ");
for(int i =0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]+"   ");
		}
	}
}
	}
}
