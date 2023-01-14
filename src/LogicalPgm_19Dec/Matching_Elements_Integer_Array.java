package LogicalPgm_19Dec;

public class Matching_Elements_Integer_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 3, 2, 4, 7, 8 };
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					
					System.out.println(arr[i]);
				}
			}
		}
	}

}
//int[] a = { 1, 2, 3, 4, 5, 1, 2, 6, 7 };
//
//for (int m = 0; m < a.length; m++) {
//
//    for (int n = m + 1; n < a.length; n++) {
//
//        if (a[m] == a[n])
//
//            System.out.print(a[m]);
//
//    }