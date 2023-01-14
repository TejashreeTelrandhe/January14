 package Package2;
import java.util.regex.Pattern;
public class StringMethods {
public static void main(String[] args) {
	    String s1 = "Primary";
		System.out.println(s1.charAt(3));//m
		System.out.println(s1.charAt(6));//y
		System.out.println(s1.length());//6
		String s2 ="keys";
		System.out.println(s1.equals(s2));//false
		String s3 = "primary";
		System.out.println(s3.equalsIgnoreCase(s1));//true
		System.out.println(s1.isEmpty());//false
		String s4 ="";
		System.out.println(s4.isEmpty());//true
		System.out.println(s1.replace("pri", "terti"));//tertiary
		System.out.println(s1.substring(3, 7));//mary
		System.out.println(s2.substring(0, 4));//key
		String s5 ="Seconday";
		System.out.println(s5.indexOf('c'));//2
		System.out.println(s5.indexOf('n'));//4
		String s6 ="Occurence";
		System.out.println(s6.lastIndexOf('n'));//6
		System.out.println(s6.lastIndexOf('c'));//7
		System.out.println(s6.toLowerCase());//occurence
		System.out.println(s3.toUpperCase());//PRIMARY
		String s7 = "MULTIPLE INHERITANCE  ";
		System.out.println(s5.replaceAll(" ", "  "));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "4Hell4"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{10}", "4Hell@01214"));//false
        System.out.println(s7.trim());//MULTIPLE INHERITANCE
        String s8 [] = s7.split(" ");
        for(int i =0;i<s8.length;i++) {
        	System.out.println(s8[i]);//MULTIPLE //INHERITANCE
        }
        System.out.println(s6.concat("disable") );//Occurencedisable
        StringBuffer SB = new StringBuffer("Compile time polymorphism");
        SB.reverse();
        System.out.println(SB);//msihpromylop emit elipmoC
	}
}
