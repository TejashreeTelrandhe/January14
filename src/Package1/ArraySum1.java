package Package1;

public class ArraySum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,5,7,9,11,13,15,17,19,21,23,25};
 int sum =arr[0];//1  //3  //5  //7
 
 System.out.println(arr.length);
 for(int i = 0;i<arr.length;i++) {
	 sum=sum+arr[i];//1+1  //2+3  //5+5   //10+7
 }
 System.out.println("Sum of elements: "+sum);
	}

}
