package Package1;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
	char c[]= new char[9];
	c[0]='A';
	c[1]='V';
	c[2]='@';
	c[3]='#';
	c[4]='%';
	c[5]='U';
	c[6]= '8';
	c[7]='P';
	c[8]='d';
	System.out.println(c.length);
	for(int j=0;j<c.length;j++) {
		System.out.print(c[j]+"   ");
	}
	System.out.println();
	Arrays.sort(c);
	for(int j=0;j<c.length;j++) {
		System.out.print(c[j]+"   ");
	}
	

	}

}
