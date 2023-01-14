package Package1;

public class LargestSmallestArray {

	public static void main(String[] args) {
int arr []= {45,12,13,26,78,89,96,99};
int max=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
}
System.out.println("Largest number in firstarray:"+max);
int min= arr[0];
 for(int k=0;k<arr.length;k++) {
	 if(arr[k]<min) {
		 min=arr[k];	 
		 }
 }
 System.out.println("Smallest number in first array:"+min);
 System.out.println();
 
int array []= {90,99,78,56,65,66,10,159};
int maximum =array[0];
for(int i=0;i<array.length;i++) {
	if(array[i]>max) {
		maximum=array[i];
	}
	}
System.out.println("Largest number in second array:"+maximum);
int minimum=array[0];
for(int m=0;m<array.length;m++) {
	if(array[m]<minimum) {
		minimum=array[m];
	}
}
System.out.println("Smallest number in second array:"+minimum);
	}

}
