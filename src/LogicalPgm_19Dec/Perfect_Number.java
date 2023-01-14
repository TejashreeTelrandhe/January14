package LogicalPgm_19Dec;

public class Perfect_Number {

	public static void main(String[] args) {
int a ;
int b=6;
int sum =0;
for(a=1;a<b;a++) {
	if(b%a==0)
		sum=sum+a;	
}
if (sum==b) {
	System.out.println( b +" is a perfect number");
}
else {
	System.out.println( b +" is not a perfect number");
}



	}

}
