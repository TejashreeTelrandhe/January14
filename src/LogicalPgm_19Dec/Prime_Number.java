package LogicalPgm_19Dec;

public class Prime_Number {

public static void main(String[] args) {
// Prime number : A number divisible only by itself and 1.
	
	int num = 7;
	int count = 0;
	for(int i=2;i<num;i++) {
		if(num%i==0) {// 7%2!=0 //7%3!=0 // 7%4!=0 //7%5!=0 // 7%6!=0 //7%7==0 
			count++;//count = count + 1 = 0+1 = 1
			break;
		}
		}
	if(count==1) {
		System.out.println("Given number is not a prime number");
	}
	else {
		System.out.println("Given number is a prime number");
	}
	}

}
