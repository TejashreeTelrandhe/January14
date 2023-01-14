package LogicalPgm_19Dec;

public class String_Vowel_Consonant {

	public static void main(String[] args) {
String a ="Increase the vowel variable by one whenever the character is found to be a vowel, using the if condition. Otherwise, increment the consonant variable.";

a = a.toLowerCase();  
int vowel=0;
int consonant =0;

for (int k = 0; k < a.length(); k++) {

    char c = a.charAt(k);

    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')

        vowel++;

    else

        consonant++;

}
System.out.println("Vowels = "+vowel);
System.out.println("Consonants = "+consonant);
	}

}
