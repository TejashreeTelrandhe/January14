package Package2;

public class CountWordsString {
public static void main(String[] args) {

//	WAP to count number of words which starts with 'm' in given String
	String Str = "The moon is the satellite of the earth that moves around the earth. We see it shining it a night by the light which the sun reflects on it. The moon is a beautiful satellite that everyone admires for its beauty. Moreover, the bright moonlight is soothing for all of us.";
	
	String arr []= Str.split(" ");
	int count = 0;
	for(int i =0;i<arr.length;i++) {
		String word = arr[i];
	for(int j =0;j<word.length();j++) {
		if(word.charAt(0)=='m' || word.charAt(0)=='M') {
			count++;
			}
		word = "";
		}
	}
	System.out.println("Count of words having intial m : "+count);
	}

}
