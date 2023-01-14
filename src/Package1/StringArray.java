package Package1;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		String s[]= new String[5];
		s[0]="Lemon";
		s[1]="Apple";
		s[2]="Orange";
		s[3]="Grapes";
		s[4]="Kiwi";
		System.out.println(s.length);
		for(int i = 0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println();

		Arrays.sort(s);
		for(int i = 0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
	}

}
