package Package2;

public class PerfectNumberPractice1 {
public static void main(String[] args) {
 int a ;
 int b = 6;
 int sum = 0;
 for(a=1 ;a<b ;a++) {
	 if(b%a==0) //1 , 2, 3 ,4,5
		 sum=sum+a;
	 }
	 if(sum == b) {//1!=6 //2!=6 //3!=6 //4!=6 //5!=6 //6==6
		 System.out.println(b+ ": is a perfect Number");
	 }
	 else {
		System.out.println(b+ ": is not a perfect Number"); 
	}
System.out.println();

int c;
int d =  15;
int summation = 0;
for(c=1;c<d;c++) {
	if(d%c==0) //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
		summation =summation + c; 
	}
	if (summation == d) {//1!=15 //2!=15 //3!=15 //4!=15 //5!=15 //6!=15
		//7!=15 //8!=15 //9!=15 //10!=15 //11!=15 //12!=15
		//13!=15 //14!=15 //15!=15 
		System.out.println(d+ ": is a perfect number");
	}
	else {//1!=15 //2!=15 //3!=15 //4!=15 //5!=15 //6!=15
		//7!=15 //8!=15 //9!=15 //10!=15 //11!=15 //12!=15
				//13!=15 //14!=15 //15!=15
		System.out.println(d+ ": is not a perfect number");
	}
}
}



