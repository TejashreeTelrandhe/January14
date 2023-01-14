package Package1;

import java.util.Arrays;

public class FloatArray {

	public static void main(String[] args) {
		float f[]= new float[7];
		f[0]=11.25f;
		f[1]=21.25f;
		f[2]=61.25f;
		f[6]=31.25f;
		f[4]=41.25f;
		f[3]=51.25f;
		System.out.println(f.length);
		for(int i = 0; i<f.length;i++) {
			System.out.print(f[i]+"   ");
		}
		System.out.println();
       Arrays.sort(f);
       for(int i = 0; i<f.length;i++) {
			System.out.print(f[i]+"   ");
		}
	}

}
