package Casting;

public class Primitive_Explicit {

	public static void main(String[] args) {
double d = 78.96;
System.out.println(d);//78.96
int i=(int) d;
System.out.println(i);//78
// data is lost 

long l = 5678469111112l;
System.out.println(l);//5678469111112

short s = (short) l;
System.out.println(s);//23880

	}

}
