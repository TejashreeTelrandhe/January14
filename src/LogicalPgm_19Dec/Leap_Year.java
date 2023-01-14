package LogicalPgm_19Dec;

public class Leap_Year {

	public static void main(String[] args) {
//		A leap year is a year, which is different than a normal year having 366 days 
//		instead of 365.A leap year comes once in four years, in which February month 
//		has 29 days. With this additional day in February, a year becomes a Leap year.
//		Some leap years examples are - 1600, 1988, 1992, 1996, and 2000.
		
//		Year must be divisible by 4
//		Year is divisible by 400 and not divisible by 100.
		int year = 2024;
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap year : " + year);
		} 
		else if (year % 4 != 0 && year % 100 != 0) {
			System.out.println("Not a leap year : " + year);
		}
	
//		if ((year %4==0) && (year %400 ==0) || (year%100!=0)) {
//			System.out.println("Leap year : "+year);
//		}
//		else if( (year%4 !=0) && (year %100!=0)) {
//			System.out.println("Not a leap year : "+year);
//		}
		
	}

}
