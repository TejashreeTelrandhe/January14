package Package1;

public class ObjectArray {

	public static void main(String[] args) {
		Object obj[]= new Object[9];
		obj[0]="Tejashree"; //String
		obj[1]=9223372036854775807l;  // Long
		obj[2]='A'; //char
		obj[3]=23.09f; //float
		obj[4]=78.9; //double
		obj[5]=true; //boolean
		obj[5]=null; //null
		obj[6]=-32768;//short
		obj[7]=2147483647;// int
		obj[8]=-128;//byte
		
		System.out.println(obj.length);
		System.out.println();
		System.out.println("Object array");
		
		for(int i =0; i<obj.length;i++) {
			System.out.println(obj[i]);
		}
}

}
