package LogicalPgm_19Dec;

import java.util.Arrays;

public class Compare_Array {

	public static void main(String[] args) {
		System.out.println("One dimensional Array");
		int arr1[] = { 1, 2, 5, 6 };
		int arr2[] = { 11, 22, 55, 66 };
		int arr3[] = { 111, 222, 555, 666 };

		System.out.println(Arrays.equals(arr1, arr2));// false
		System.out.println(Arrays.equals(arr2, arr3));// false
		System.out.println(Arrays.equals(arr1, arr3));// false
		
//		Arrays.equals(): Returns true if the two specified arrays of ints are equal to one another.  
		System.out.println("Two dimensional Array");
		String s1[][] = { { "webbed", "automation" }, { "functional", "regression" } };
		String s2[][] = { { "Java", "Perl" }, { "Python", "C#" } };
		String s3[][] = { { "webbed", "automation" }, { "functional", "regression" } };

		System.out.println(Arrays.deepEquals(s1, s2));// false
		System.out.println(Arrays.deepEquals(s2, s3));// false
		System.out.println(Arrays.deepEquals(s1, s3));// true
		
//      Returns true if the two specified arrays are deeply equal to one another. 
//		Unlike the equals(Object [], Object [])method, this method is appropriate 
//		for use with nested arrays of arbitrary depth. 

	}

}
