package Array;

public class Max_Array {

	public static void main(String[] args) {
		  //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
	}

}
//arr[0]=25; = max
//arr[1]=11;
//arr[2]=7;
//arr[3]=75;
//arr[4]=56;
//(arr[i] > max)
//25>25-false
//11>25-false
//7>25-false
//75>25-true  >>>> max=75
//56>75-false
// Therefore max value would be 75 
