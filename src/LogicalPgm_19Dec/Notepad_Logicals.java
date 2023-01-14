package LogicalPgm_19Dec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notepad_Logicals {

	public static void main(String[] args) {

		int num = 153;

		int temp = num;

		int sum = 0;

		int rem;

		while (temp != 0) {

			rem = temp % 10;

			sum = sum + (rem * rem * rem);

			temp = temp / 10;

		}

		if (sum == num) {

			System.out.println("The " + num + " is a armstrong number");

		}

		else {

			System.out.println("The " + num + " is not a armstrong number");

		}

		int number = 8;

		int factorial = 1;

		for (int i = number; i >= 1; i--) {

			factorial = factorial * i;

		}

		System.out.println("Factorial of 8 is " + factorial);

		int a = -1;

		int b = 1;

		int c;

		System.out.println("Factorial Number");

		for (int i = 0; i <= 15; i++) {

			c = a + b;

			System.out.print(c + " , ");

			a = b;

			b = c;

		}
		System.out.println();

		int year = 1996;

		if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0)) {

			System.out.println(year + " is a leap year");

		}

		else if ((year % 4 != 0) && (year % 100 != 0)) {

			System.out.println(year + " is not a leap year");

		}

		int num1 = 45654;

		int temp1 = num1;

		int rev = 0;

		int rem1;

		while (temp1 != 0) {

			rem1 = temp1 % 10;

			rev = rev * 10 + rem1;

			temp1 = temp1 / 10;

		}

		if (rev == num1) {

			System.out.println(num1 + " ia a palindrome number");

		}

		else {

			System.out.println(num1 + " is not a palindrome number");

		}

		int prime = 8;

		int count = 0;

		for (int i = 2; i <= 8; i++) {

			if (prime % i == 0) {

				count++;

			}

		}

		if (count == 1) {

			System.out.println(prime + " is a prime number");

		}

		else {

			System.out.println(prime + " is not a prime number");

		}

		String str = "abcdefgfedcba";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}
		System.out.println(reverse);
		if (reverse.equals(str)) {

			System.out.println("String is a palindrome string");

		}

		else {

			System.out.println("String is not a palindrome string");

		}

		String s = "Palindrome string is the string which gives same outcome when read in opposite direction.";

		String Rev = "";

		String split[] = s.split(" ");

		for (String word : split) {

			String Revword = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				Revword = Revword + word.charAt(i);

			}

			Rev = Rev + Revword + " ";

		}

		System.out.println(Rev);

		String S = "Palindrome string is the string which gives same outcome when read in opposite direction.";

		int count1 = 0;

		for (int i = 0; i < S.length(); i++) {

			if (s.charAt(i) == ' ') {

				count1++;

			}

		}

		System.out.println(count1 + " is the number of white spaces");

		int a1 = 12;

		int b1 = 24;

		int c1;

		System.out.println("Before swapping two number a = " + a1 + " and b = " + b1);

		c1 = a1; // 12

		a1 = b1; // 24

		b1 = c1; // 12

		System.out.println("After swapping two number a = " + a1 + " and b = " + b1);

		int a11 = 45;

		int b11 = 35;

		System.out.println("Before swapping two number a = " + a11 + " and b = " + b11);

		a = a + b; // a = 80

		a = a - b; // a = 80 - 35 = 45

		b = a - b; // a = 80 - 45 = 35

		System.out.println("After swapping two number a = " + a11 + " and b = " + b11);

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 6 - i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
		System.out.println();

		String ss = "Swapping two number without third numbers";

		int count11 = 1;

		for (int i = 0; i < ss.length(); i++) {

			if (ss.charAt(i) == ' ' && ss.charAt(i + 1) != ' ') {

				count11++;
			}
		}
		System.out.println(count11 + " is the number of words in string");

		String str1 = "!@#ash@$#winjn*()@#$%2QWERT&*&(((mn";

		str1 = str1.replaceAll("[^a-z,A-Z]", "");

		System.out.println(str1);

		String s22 = "Palindrome string is the string which gives same outcome when read in opposite direction.";

		int counting = 0;

		String splitstring[] = s22.split(" ");

		for (int i = 0; i < splitstring.length; i++) {

			String arr = splitstring[i];

			for (int j = 0; j < arr.length(); j++) {

				if (arr.charAt(0) == 'S' || arr.charAt(0) == 'i') {

					counting++;

				}

			}

		}

		System.out.println(counting + " is the number of words starting with S and i letters collectively");

		String sss = "Counting number of vowels and consonants.";

		sss = sss.toLowerCase();

		int vowels = 0;

		int consonants = 0;

		for (int i = 0; i <= sss.length() - 1; i++) {

			if (sss.charAt(i) == 'a' || sss.charAt(i) == 'e' || sss.charAt(i) == 'i' || sss.charAt(i) == 'o'
					|| sss.charAt(i) == 'u') {

				vowels++;
			}

			else {

				consonants++;

			}

		}

		System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);

		int array[] = { 1, 2, 3, 4, 5, 6, 4, 5, 3, 2, 9 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					System.out.print(array[i] + ", ");

				}

			}

		}
		System.out.println();

		String s11 = "Occurence of character in the string";

		char search = 'c';

		int count111 = 0;

		for (int ii = 0; ii < s11.length(); ii++) {

			if (s11.charAt(ii) == search) {

				count111++;

			}

		}

		System.out.println(count111 + " is the occurence of c character in the given string");

		int m = 15;

		int n = 10;

		int sum1 = 0;

		for (int i = 1; i <= n; i++) {

			sum1 = sum1 + m;

		}

		System.out.println("15 * 10 = " + sum1);

		int number1 = 44;

		int number2 = 4;

		int div = 0;

		for (int i = number1; i >= 0; i--) {

			if (number1 >= number2) {

				number1 = number1 - number2;

				div++;

			}

		}

		System.out.println("44 / 4 is " + div);

		int mm = 6;

		int nn;

		int per = 0;

		for (nn = 1; nn < mm; nn++) {
			if (mm % nn == 0) {
				per = per + nn;// 1+2+4+8
			}
		}

		if (per == mm) {

			System.out.println(mm + " is the perfect number");

		}

		else {

			System.out.println(mm + " is not perfect number");

		}
		String regex = "[aeiouAEIOU]";

		String input = "Welcome back";
		// Compiling the regular expression
		Pattern.compile(regex);
		// Compiling the regular expression
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			System.out.println("The input string contains vowels");
		} 
		else {
			System.out.println("The input string does not contain vowels");
		}

	}
}