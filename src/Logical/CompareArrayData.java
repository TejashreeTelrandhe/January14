package Logical;

import java.util.Arrays;

public class CompareArrayData {
public static void main(String[] args) {
	int arr1[] = {10,20,30};
	int arr2[]= {30,40,50};
	int arr3[]= {50,60,70};
	int arr4[]= {30,40,50};
	System.out.println(Arrays.equals(arr1, arr2));//false
	System.out.println(Arrays.equals(arr2, arr3));//false
	System.out.println(Arrays.equals(arr1, arr3));//false
	System.out.println(Arrays.equals(arr1, arr4));//false
	System.out.println(Arrays.equals(arr2, arr4));//true
	System.out.println(Arrays.equals(arr3, arr4));//false
//	equals : Returns true if the two specified arrays of Objects are 
//	equal to one another. The two arrays are considered equal if both
//	arrays contain the same number of elements, and all corresponding
//	pairs of elements in the two arrays are equal.

	
	boolean b1[][]= {{true,false},{true,false}};
	boolean b2[][]= {{false,false},{false,false}};
	boolean b3[][]= {{true,true},{true,true}};
    System.out.println(Arrays.equals(b1, b2));//false
    System.out.println(Arrays.equals(b2, b3));//false
    System.out.println(Arrays.equals(b1, b3));//false
    System.out.println(Arrays.deepEquals(b1, b2));//false
    System.out.println(Arrays.deepEquals(b2, b3));//false
    System.out.println(Arrays.deepEquals(b1, b3));//false
//  deepEquals : Returns true if the two specified arrays are deeply equal 
//    to one another. 
//    
}
}
