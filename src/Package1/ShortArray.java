package Package1;

import java.util.Arrays;

public class ShortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 short s1[]= new short[6];
 s1[0]=15121;
 s1[1]=25212;
 s1[2]=356;
 s1[5]=4545;
 s1[3]=6511;
 s1[4]=5500;
 System.out.println(s1.length);

	for(int i = 0; i<s1.length;i++) {
		System.out.print(s1[i]+"   ");
	}
	System.out.println();
	Arrays.sort(s1);
	for(int i = 0; i<s1.length;i++) {
		System.out.print(s1[i]+"    ");
	}
	}

}
