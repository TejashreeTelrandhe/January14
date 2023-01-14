package Package1;

public class OddNumberArray {

	public static void main(String[] args) {
		int arr[]= {10,11,12,13,14,15,16};
		
		System.out.println(arr.length);//7
		System.out.println("Odd numbers");
		
		for(int i = 0;i<arr.length;i++) {//0   //1   //2   //3   //4   //5   //6  
		
			if(arr[i]%2!=0) {//10%2!=0-false
				//11%2!=0-true
				//12%2!=0-false
				//13%2!=0-true
				//14%2!=0-false
				//15%2!=0-true
				//16%2!=0-false
				
				System.out.println(arr[i]);	//11   //13  //15
			}
			}
	}
}