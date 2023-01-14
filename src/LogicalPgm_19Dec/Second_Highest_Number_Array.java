package LogicalPgm_19Dec;

public class Second_Highest_Number_Array {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int largest = arr[0];
		int secondHighest = arr[0];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondHighest = largest;
				largest = arr[i];

			} else if (arr[i] > secondHighest) {
				secondHighest = arr[i];

			}
		}
		System.out.println();
		System.out.println("Second Highest Number Is:" + secondHighest);

	}
}
