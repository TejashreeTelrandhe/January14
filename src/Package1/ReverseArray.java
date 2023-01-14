package Package1;

public class ReverseArray {

	public static void main(String[] args) {
		int num[]= {11,12,13,14,15,16,17,18,19,20};
		
		System.out.println(num.length);
		System.out.println("Original Array");
	for(int i =0;i<num.length;i++) {//0   //1  //2   //3  //4   //5   //6   //7   //8   //9  
		System.out.print(num[i]+"   ");//11  //12   //13  //14   //15   //16   //17   //18   //19  //20 
	}
	System.out.println();
	
    System.out.println("Reverse Array");
	for(int i=num.length-1;i>=0;i--) {//9  //8   //7  //6   //5  //4   //3   //2   //1   //0   
		System.out.print(num[i]+"   ");//20  //19  //18   //17  //16   //15  //14   //13   //12   //11  
	}
	}
}
