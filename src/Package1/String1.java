package Package1;

public class String1 {

	public static void main(String[] args) {
		String s1="Java";
		String s2="c";
		String s3= new String ("Java");
		String s4 = new String ("Java");
		String s5="c";
        String s6= new String ("Tejas");
//       Heap                            SCP 
//       s3 - Java                    s1,s3,s4-Java
//       s4 - Java                    s2,s5-c
//       s6 - Tejas                   s6-Tejas

        System.out.println("Location checking");
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s1==s5);//false
        System.out.println(s1==s6);//false
        System.out.println(s2==s3);//false
        System.out.println(s2==s4);//false
        System.out.println(s2==s5);//true
        System.out.println(s2==s6);//false
        System.out.println(s3==s4);//false
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
        System.out.println(s4==s5);//false
        System.out.println(s4==s6);//false
        System.out.println(s5==s6);//false
        System.out.println();
        
        System.out.println("Content checking");
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//true
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equals(s6));//false
        System.out.println(s2.equals(s3));//false
        System.out.println(s2.equals(s4));//false
        System.out.println(s2.equals(s5));//true
        System.out.println(s2.equals(s6));//false
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s5));//false
        System.out.println(s3.equals(s6));//false
        System.out.println(s4.equals(s5));//false
        System.out.println(s4.equals(s6));//false
        System.out.println(s5.equals(s6));//false
	}

}
