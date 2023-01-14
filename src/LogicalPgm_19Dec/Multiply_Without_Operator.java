package LogicalPgm_19Dec;

public class Multiply_Without_Operator {

	public static void main(String[] args) {
		int num1 = 14;
		int num2 = 5;
		int sum = 0;
		for (int i = 1; i <= num2; i++) {
			sum = sum + num1;// 0+14 = 14 i=1
								// 14+14 = 28 i=2
								// 28+14 = 42 i=3
								// 42+14 = 56 i=4
								// 56+14 = 70 i=5
		}
		System.out.println(sum);
	}

}
