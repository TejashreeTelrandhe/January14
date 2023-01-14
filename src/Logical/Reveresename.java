package Logical;

public class Reveresename {
	
public static void main(String[] args) {
	
String name="QualityAssurance";

System.out.println(name.length());

for(int i = name.length()-1;i>=0;i--) {
	
System.out.print(name.charAt(i)); //ecnarussAytilauQ
}
System.out.println();

for(int j=0;j<name.length();j++) {
	
System.out.print(name.charAt(j)); //QualityAssurance
}
//length() : Returns the length of this string.

//charAt() : Returns the char value at the specified index. 
//An index ranges from 0 to length() - 1. The first char value
//of the sequence is at index 0, the next at index 1,and so on,
//as for array indexing. 
}
}
