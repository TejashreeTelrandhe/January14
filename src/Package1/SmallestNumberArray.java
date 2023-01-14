package Package1;

public class SmallestNumberArray {

	public static void main(String[] args) {
		int arr[]= {45,23,56,86,12,6,100};
		int smallest =arr[0];//45  //23  //56  //86   //12  //6  //100
		
System.out.println(arr.length);//7

for(int i=0;i<arr.length;i++) {//0  //1   //2   //3  //4  //5  //6  
	if(arr[i]<smallest) {//45<45- false    //23<45- true   //56<23-false
      //86<23-false      //12<23-true    //   6<12  -true   //100<6- false
		
		smallest=arr[i];//23   //12   //6
		// latest smallest value is 6 
	}
}
	System.out.println("Smallest number present in the array: "+smallest);

}
}