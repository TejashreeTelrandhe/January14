package Package1;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st[]= {"Polymorphism","Inheritance","Abstraction","Encapsulation","Interface"};
	
	for(int i=0;i<st.length;i++) {
		System.out.print(st[i] +"   ");
	}
	System.out.println();
	Arrays.sort(st);

	for(int i=0;i<st.length;i++) {
		System.out.print(st[i]+ "   ");
	}
		
	}

}
