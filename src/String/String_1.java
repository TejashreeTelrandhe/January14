package String;

public class String_1 {

	public static void main(String[] args) {
String s1 ="JavaScript";
String s2 ="Executor";
String s3 = new String ("Selenium");
String s4 = new String ("Script");
String s5 = new String ("Selenium");

System.out.println(s1.equals(s2));//false
System.out.println(s1.equals(s3));//false
System.out.println(s1.equals(s4));//false
System.out.println(s1.equals(s5));//false
System.out.println(s2.equals(s3));//false
System.out.println(s2.equals(s4));//false
System.out.println(s2.equals(s5));//false
System.out.println(s3.equals(s4));//false
System.out.println(s3.equals(s5));//true
System.out.println(s4.equals(s5));//false
System.out.println();
System.out.println(s1==s2);//false
System.out.println(s1==s3);//false
System.out.println(s1==s4);//false
System.out.println(s1==s5);//false
System.out.println(s2==s3);//false
System.out.println(s2==s4);//false
System.out.println(s2==s5);//false
System.out.println(s3==s4);//false
System.out.println(s3==s5);//false
System.out.println(s4==s5);//false

//The main difference between the .equals() method and == operator is that one is
//a method, and the other is the operator.We can use == operators for reference 
//comparison (address comparison) and .equals() method for content comparison. 
//In simple words, == checks if both objects point to the same memory location
//whereas .equals() evaluates to the comparison of values in the objects.


//Q- Why Strings are immutable in java?
//1.As Java uses the concept of String literal. Suppose there are 5 reference variables,
//all refer to one object "Sachin". If one reference variable changes the value of the
//object, it will be affected by all the reference variables. That is why String objects are immutable in Java.
//are immutable in Java.

//2. Security 
//If we don’t make the String immutable, it will pose a serious security threat to the 
//application. For example, database usernames, passwords are passed as strings to 
//receive database connections. The socket programming host and port descriptions 
//are also passed as strings. The String is immutable, so its value cannot be changed. 
//If the String doesn’t remain immutable, any hacker can cause a security issue in the 
//application by changing the reference value.

//3. Code optimization and performance


//Q- Why String class is Final in Java?
//The reason behind the String class being final is because no one can override the methods 
//of the String class. So that it can provide the same features to the new String objects 
//as well as to the old ones.
	}

}
