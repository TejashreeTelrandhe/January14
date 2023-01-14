package Logical;

public class ArmStrongNumber {

public static void main(String[] args) {
// Armstrong number is number that is equal to sum of cubes of its digits.
	
	int orgnum = 153;
	int sum = 0;
	for(int i = orgnum;i>0;i=i/10) { 
		int rem  = i%10;
		sum = sum +(rem*rem*rem);
	}
	if(orgnum==sum) {
		System.out.println("Given number "+orgnum+" is a armstrong number");
	}
	else {
		System.out.println("Given number "+orgnum+" is not a armstrong number");
	}
	}
}
