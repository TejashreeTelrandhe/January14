package Wrapper_Class;

public class Wrapper_Class_3 {

public static void main(String[] args) {
// Autoboxing : Primitive to wrapper class
//Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.

int a = 20;
Integer b =a;
//Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
//Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  

System.out.println("Primitive : "+a);//20
System.out.println("Autoboxing : "+b);//20

int Data = 500;
Integer newdata = Integer.valueOf(Data);// using valueOf() method
System.out.println("using valueOf() method : "+newdata);//500
	
//Unboxing: wrapper type into its corresponding primitive type
//Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives.
Integer result = 70;
int mark1=result;
System.out.println("Unboxing : "+mark1);//70

Integer i = 45;
int num = i.intValue(); //using intValue() method
System.out.println("using intValue() method : "+num);//45

Integer mark= 50;
int updatedmarks =mark.intValue();
System.out.println("using intValue() method : "+updatedmarks);//50
}

}
