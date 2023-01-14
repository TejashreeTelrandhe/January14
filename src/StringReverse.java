
public class StringReverse {

	public static void main(String[] args) {
		
		String a = "My name is Tejas";
		// a.length()= 16
		// a.charAt() = My name is  T  e j a s
		            //= 0123456789101112131415
		
		int leng = a.length();//16
		System.out.println(leng);//16
		String Rev ="";
		for(int i = leng-1;i>=0;i--) {
			Rev = Rev + a.charAt(i);
		}
         System.out.println(Rev);
	}
}
//sajeT si eman yM
//yM eman si sajeT