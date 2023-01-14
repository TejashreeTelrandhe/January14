package LogicalPgm_19Dec;

public class Count_Words_inString {

	public static void main(String[] args) {
		String s1 = "If an element has spaces in its text or in the value of any attribute, then to create an xpath for such an element we have to use the normalize-space function. It removes all the trailing and leading spaces from the string.";
		System.out.println(s1.length());
		int count = 1;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println("Total number of words in given String is "+count);
	}

}
