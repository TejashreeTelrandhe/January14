package Array;

public class Odd_Even_Min_Max_Array {

public static void main(String[] args) {
	int dd[]= {14,25,20,22,16,35,17,85,1};
	System.out.println("Length of the array = "+dd.length);
	
//	Even Array
	System.out.println("Even numbers in the array are ");
	for(int i =0;i<=dd.length-1;i++) {
		if(dd[i]%2==0) {
			System.out.println(dd[i]);
		}
	}
	System.out.println();
	
//	Odd Array
	System.out.println("Odd numbers in the array are");	
	for(int j=0;j<=dd.length-1;j++) {
		if(dd[j]%2!=0) {
			System.out.println(dd[j]);
		}
	}
	System.out.println();
	
//	Min Array
	System.out.println("Minimum value in the array are");	
	for(int k=0;k<=dd.length-1;k++) {
		int min=dd[0];//14
		if(min > dd[k]) {//14>25-false , 14>20-false,16>25-false ,14>25-false , 14>17-false , 14>85-false,14>19-false ,
			//14>63-false , 14>6-true ,14>20-false , 14>14-false,14>45-false ,			
			//14>25-false , 14>23-false,14>54-false ,
			min=dd[k];
			System.out.println(min);
		}
	}
	System.out.println();
	
//	Max Array
	System.out.println("Maximum value in the array are");
	int max=dd[0];//14
	for(int l =0;l<=dd.length-1;l++) {		
    if(max < dd[l]) 
       max= dd[l];        
	}
	 System.out.println(max);
	}

}
