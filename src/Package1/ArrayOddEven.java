package Package1;

public class ArrayOddEven {

	public static void main(String[] args) {
		int arr []= {12,15,48,56,32,31,17,19};
		System.out.println("Odd Numbers : ");
		for(int i =0;i<arr.length;i++) {
	
			if(arr[i]%2!=0) {
			System.out.print(arr[i]+", ");
			}
		}
		System.out.println();
		System.out.println("Even Numbers : ");
		for(int j =0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				System.out.print(arr[j]+", ");
			}
		}
		System.out.println();
		int array []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println("Odd Number = ");
		for(int i =0;i<array.length;i++) {
			if(array[i]%2!=0) {
				System.out.print(array[i]+", ");
			}
			}
		System.out.println();
		System.out.println("Even Number = ");
		for(int j=0;j<array.length;j++) {
			if(array[j]%2==0) {
				System.out.print(array[j]+", ");
			}
		}
	}

}
