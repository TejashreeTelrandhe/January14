package String;

import java.util.regex.Pattern;

public class String_Methods {

	public static void main(String[] args) {
String s1 ="Interview";
System.out.println(s1.charAt(5));//v
System.out.println(s1.isEmpty());//false
String s2 ="Perform";
System.out.println(s1.equals(s2));//false
String s3 ="PERFORM";
System.out.println(s2.equalsIgnoreCase(s3));//true
System.out.println(s1.length());//9
System.out.println(s2.length());//7
System.out.println(s3.length());//7S
System.out.println(s1.replace('I', 'i'));//interview
String s4 = "12-89-1099";
System.out.println(s4.replaceAll("-", "/"));//12/89/1099
String s5 ="Javascript executor";
System.out.println(s5.substring(9));//t executor
System.out.println(s5.substring(5, 13));//cript ex
System.out.println(s5.lastIndexOf('e'));//13
System.out.println(s5.indexOf('a'));//1
System.out.println(s3.toLowerCase());//perform
System.out.println(s1.toUpperCase());//INTERVIEW
String s6 = "  Trimming spaces  ";
System.out.println(s6.trim());//Trimming spaces
String s7 ="Hello-good-morning-java-developer";
String s8 []= s7.split("-");
for(int i =0;i<s8.length;i++) {
System.out.print(s8[i]+" ");//Hello good morning java developer 
}
System.out.println();
System.out.println(s1.concat(s6));//Interview  Trimming spaces 
StringBuffer sb = new StringBuffer("Good For You");
sb.reverse();
System.out.println(sb);//uoY roF dooG
System.out.println("Regexpattern :"+Pattern.matches("[a-zA-Z0-9]{6}","AHell4"));//true
System.out.println("Regexpattern :"+Pattern.matches("[a-zA-Z0-9]{9}","AHell4@09d"));//false

	}

}
