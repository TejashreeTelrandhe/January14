package Array;

public class Sum_Array {

	public static void main(String[] args) {
int arr []={25, 11, 7, 75, 56};
int sum =0;
for(int i =0;i<=arr.length-1;i++) {
	sum=sum+arr[i];
	System.out.println(sum);
}
System.out.println("Total sum of the array is "+sum);
	}
}
// sum=0;
// sum=0=0+arr[0]=0+25=25
// sum=25+arr[1]=25+11=36
// sum=36+arr[2]=36+7=43
// sum=43+arr[3]=43+75=118
// sum=118+arr[4]=118+56=174
//  Therefore sum value would be 174 

