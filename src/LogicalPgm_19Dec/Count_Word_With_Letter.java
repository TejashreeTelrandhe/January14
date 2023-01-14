package LogicalPgm_19Dec;

public class Count_Word_With_Letter {

	public static void main(String[] args) {
		String s1 ="XPath/XQuery normalize-space function. Examples: The expression fn:normalize-space(\" The wealthy curled darlings of our nation.";
		String arr []=s1.split(" ");
		
		System.out.println(arr.length);
		int count =0;
		for(int i = 0;i<arr.length;i++) {
			String word = arr[i];
			for(int j=0;j<word.length();j++) {
				if(word.charAt(0)=='E' || word.charAt(0)=='e') {
					count++;
				}
				word=" ";
			}
		}
	System.out.println("Number of words with e as initial letter is "+count);
	}

}
