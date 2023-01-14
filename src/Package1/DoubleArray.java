package Package1;

import java.util.Arrays;

public class DoubleArray {

	public static void main(String[] args) {
		double d[]= new double[6];
	d[0]=15.23;
	d[1]=15.52;
	d[2]=10.023;
	d[3]=20.36;
	d[4]=7.56;
	d[5]=30.26;
	System.out.println(d.length);
	for(int i = 0;i<d.length;i++) {
		System.out.print(d[i]+"   ");
	}
	System.out.println();
    Arrays.sort(d);
    for(int i = 0;i<d.length;i++) {
		System.out.print(d[i]+"   ");
	}
	}

}
