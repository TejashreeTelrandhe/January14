package Package2;
public class String1Practice {
public static void main(String[] args) {
String s1 = "Access";//SCP
String s2 = "Protected";//SCP
String s3 = new String ("Public"); //heap ,SCP
String s4 = new String ("Private");//heap ,SCP
String s5 = new String ("Public");//heap ,SCP
String s6 = "Protected";//SCP
String s7 = new String ("Default");//heap ,SCP

System.out.println(s1.equals(s2));//false
System.out.println(s1.equals(s3));//false
System.out.println(s1.equals(s4));//false
System.out.println(s1.equals(s5));//false
System.out.println(s1.equals(s6));//false
System.out.println(s1.equals(s7));//false
System.out.println();
System.out.println(s2.equals(s3));//false
System.out.println(s2.equals(s4));//false
System.out.println(s2.equals(s5));//false
System.out.println(s2.equals(s6));//true
System.out.println(s2.equals(s7));//false
System.out.println();
System.out.println(s3.equals(s4));//false
System.out.println(s3.equals(s5));//true
System.out.println(s3.equals(s6));//false
System.out.println(s3.equals(s7));//false
System.out.println();
System.out.println(s4.equals(s5));//false
System.out.println(s4.equals(s6));//false
System.out.println(s4.equals(s7));//false
System.out.println();
System.out.println(s5.equals(s6));//false
System.out.println(s5.equals(s7));//false
System.out.println();
System.out.println(s6.equals(s7));//false
System.out.println();
System.out.println();
System.out.println(s1==s2);//false
System.out.println(s1==s3);//false
System.out.println(s1==s4);//false
System.out.println(s1==s5);//false
System.out.println(s1==s6);//false
System.out.println(s1==s7);//false
System.out.println();
System.out.println();
System.out.println(s2==s3);//false
System.out.println(s2==s4);//false
System.out.println(s2==s5);//false
System.out.println(s2==s6);//true
System.out.println(s2==s7);//false
System.out.println();
System.out.println(s3==s4);//false
System.out.println(s3==s5);//false
System.out.println(s3==s6);//false
System.out.println(s3==s7);//false
System.out.println();
System.out.println(s4==s5);//false
System.out.println(s4==s6);//false
System.out.println(s4==s7);//false
System.out.println();
System.out.println(s5==s6);//false
System.out.println(s5==s7);//false
System.out.println();
System.out.println(s6==s7);//false
}

}
