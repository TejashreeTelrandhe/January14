package Package2;

import java.util.Arrays;

public class StringArrayPractice {

	public static void main(String[] args) {
String str []= {"File","Edit","Source","Refactor","Navigate","Search","Project","Run","Window","Help"};
	
	System.out.println("Elements in the array:");

	for(int i=0;i<str.length;i++) {
		System.out.print(str[i]+"     ");
	}
	System.out.println();
	
	System.out.println("Sorted elements in the array:");
	Arrays.sort(str);
	for(int i=0;i<str.length;i++) {
		System.out.print(str[i]+"     ");
	}
	}
}
