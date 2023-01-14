package Package1;

public class EvenNumberArray {

	public static void main(String[] args) {
		int arr[]= {10,11,12,13,14,15,16};
		
		System.out.println(arr.length);//7
		
		System.out.println("Even numbers");
		
		for(int i=0;i<arr.length;i++) {//0  //1  //2  //3  //4  //5  //6
			if(arr[i]%2==0) {//10%2==0-true
				//11%2==0-false
				//12%2==0-true
				//13%2==0-false
				//14%2==0-true
				//15%2==0-false
				//16%2==0-true
				System.out.println(arr[i]);
			}
		}
	}

}
