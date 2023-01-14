package Package2;

import java.util.Arrays;

public class ReverseArrayPractice {

	public static void main(String[] args) {
int a []= {12,67,88,99,33,44,656,90,11,23,11};
System.out.println(a.length);
System.out.println("Original array : ");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+"   ");
}
System.out.println();
System.out.println("Reverse array : ");
for(int i=a.length-1;i>=0;i--) {
	System.out.print(a[i]+"   ");
}
System.out.println();
System.out.println("Reverse array : ");
Arrays.sort(a);
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+"   ");
}
}
}