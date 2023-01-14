package Package1;

public class LargestNumberArray {

	public static void main(String[] args) {
		int num[]= {21,65,25,32,13,49,10};
	int largest =	num[0];//21     //65   //25   //32   //13   //49   //10
	
	System.out.println(num.length);//7
	
	for(int i = 0;i<num.length;i++) {//0  //1  //2  //3  //4   //5  //6  //7
		if(num[i]>largest) {//21>21-false   // 65>21-true  
		//	num[i]=65    
		//25>65-false     //32>65-false
		// 13>65-false    // 49>65-false    //10>65-false
			largest=num[i];//65
		}
	}
System.out.println("Largest number present in given array:" +largest);
	}

}
