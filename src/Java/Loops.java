package Java;

public class Loops {

	public static void main(String[] args) {
// for Loop
// Print odd number in increasing order
System.out.println("Odd Numbers in increasing order");
for(int i=1;i<100;i++) {
	System.out.print(i+" " );
}
System.out.println();
System.out.println();
//Print even number in decreasing order	
System.out.println("Even Numbers in decreasing order");
for(int i=100;i>=0;i--) {
System.out.print(i+" " );
}
System.out.println();	
System.out.println();
// while loop
// Print Multiples of 100 from 100 to 1000
int j = 100;
System.out.println("Multiples of 100 drom 100 to 1000");
while(j<=1000) {
	System.out.print(j+" ");
	j=j+100;
}
System.out.println();
System.out.println();
// Print Multiples of 15 in decreasing order from 500 to 15
int m = 495;
System.out.println("Multiples of 15 in decreasing order");
while(m>=15) {
System.out.print(m+" ");
m=m-15;
}
System.out.println();	
System.out.println();
// do while 
//  Print Multiples of 12 from 12 to 120
int n = 12;
System.out.println("Multiples of 12 ");
do {
	System.out.print(n+" ");
	n=n+12;
}
while(n<=120);
System.out.println();	
System.out.println();
//Print Multiples of 7 from 140 to 7
int p = 140;
System.out.println("Multiples of 7 in decreasing order");
do {
	System.out.print(p+" ");
	p=p-7;
}
while(p>=7);
System.out.println();
System.out.println();
// for each loop
//declaring an array  
int arr[]={12,13,14,44};  
int array []= {11,22,33,44,55,66,77,88,99,110};
//traversing the array with for-each loop  
System.out.println("Array arr [] transversed using for each loop");
for(int i:arr){  
  System.out.print(i+" ");  
}
System.out.println();
System.out.println();
System.out.println("Array array [] transversed using for each loop");
for (int k :array) {
	System.out.print(k+" ");
}
}
	}

