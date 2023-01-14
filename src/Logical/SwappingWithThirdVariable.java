package Logical;
public class SwappingWithThirdVariable {
public static void main(String[] args) {
int a = 15;
int b = 25;
System.out.println("Before Swapping : a = "+a+",b = "+b);
int c = a;
a = b;
b = c;
System.out.println("After Swapping : a = "+a+",b = "+b);
}
}
