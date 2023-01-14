package Package2;

public class SwapnumbersPractice {
	
public static void main(String[] args) {
int a = 15;
int b = 30;
System.out.println("Before swapping : "+"a="+a+" , b="+b);
a=a+b;
b=a-b;		
a=a-b;
System.out.println("After swapping : "+"a="+a+" , b="+b);
		
System.out.println();

int c = 40;
int d = 20;
System.out.println("Before swapping : "+"c="+c+" , d="+d);
c=c+d;
d=c-d;
c=c-d;
System.out.println("After swapping : "+"c="+c+" , d="+d);
}
}
