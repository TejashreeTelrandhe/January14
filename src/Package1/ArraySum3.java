package Package1;

public class ArraySum3 {

	public static void main(String[] args) {
		int number[]= {1,2,3,4,5,6,7,8,9};
		
int mul =number[0];//1   //2   //3  //4   //5  
                   //6   //7   //8  //9

System.out.println(number.length);
for(int i =0; i<number.length;i++) {
	mul=mul*number[i];//1*1=1  //1*2=2    //2*3=6   //6*4=24  //24*5=120
	                  //120*6=720   //720*7=5040  //5040*8= 40320   //40320*9= 362280
}
System.out.println("Multiplication of elements: "+mul);
	}

}
