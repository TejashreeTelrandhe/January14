package LogicalPgm_19Dec;

public class Armstrong_Number {

	public static void main(String[] args) {
//  Armstrong Number : Armstrong number is number that is equal to sum of cubes of its digit.
	int orgnum = 153; //1+125+27=153
	int sum = 0;
	for(int i= orgnum;i>0;i=i/10) { //i=153 // i=153/10=15  // i = 15/10= 1 
		int rem=i%10;  //153%10 = 3 // 15%10 =5    //1%10 =1
		sum = sum +(rem*rem*rem); //= 0+ (3*3*3) = 27
		                          //= 27+ (5*5*5) = 152
		                          //= 152+ (1*1*1) = 153 
	}
	if(sum==orgnum) {
		System.out.println(orgnum+" : is a armstrong number.");
	}
	else {
		System.out.println(orgnum+" : is not a armstrong number.");
	}
	
	int armnum = 489;
	int summation=0;
	for(int i=armnum;i>0;i=i/10) {//i= 489 // i=489/10 = 48 //i=48/10=4
		int remainder = i%10;// 489%10 = 9  // 48%10 =8  //4%10=4
		summation = summation +(remainder*remainder*remainder);
		// = 0+(9*9*9)=729
		// = 729 + (8*8*8) = 729+512 = 1241
		// = 1214 + (4*4*4) = 1276
	}
	if(summation==armnum) {
		System.out.println(armnum+" : Armstrong number");
	}
	else {
		System.out.println(armnum+" : Not a Armstrong number");
		
		int num = 153;
		int temp = num;
		int rem ;
		int rev =0;
		while (temp!=0) {
			rem = temp%10;
			rev=rev +(rem*rem*rem);
			temp=temp/10;
		}
		
		if(num==rev) {
			System.out.println("Armstrong number : "+num);
		}
		else {
			System.out.println("Not a armstrong number : "+num);
		}
    }
	}

}
