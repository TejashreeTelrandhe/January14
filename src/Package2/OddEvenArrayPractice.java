package Package2;

public class OddEvenArrayPractice {

	public static void main(String[] args) {
int arr[]= {19,28,37,46,59,12,13,14,76,43};
System.out.println("Arrays length : "+arr.length);
System.out.println("Odd Numbers");
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2!=0) {
		System.out.println(arr[i]);
	}
}
System.out.println();
System.out.println("Even Numbers");
	for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.println(arr[i]);
	}
	}
	}

}
