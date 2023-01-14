package Package1;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {
		int num[][]= {{1,1,1,1},{2,2,2,2,}};
		
	    System.out.println(num.length);//2
	    
	    System.out.println(num[1].length);//4
		System.out.println();
		
		System.out.println(num[0][0]);//1
		System.out.println(num[0][1]);//1
		System.out.println(num[0][2]);//1
		System.out.println(num[0][3]);//1
		System.out.println();
		
		System.out.println(num[1][0]);//2
		System.out.println(num[1][1]);//2
		System.out.println(num[1][2]);//2
		System.out.println(num[1][3]);//2
		System.out.println();
		
		for(int i =0;i<num.length;i++) {//0                                 //1
			for(int j=0; j<num[1].length;j++) {//0  //1  //2    //3         //0  //1  //2    //3
			// As j++=3++=4-false then value of i increases from 0 to 1 of 1st for loop
			// and again 2nd for loop iterates till value of j=3 , when value of j becomse 4
		    // then value of i in 1st for loop increases from 1 to 2 this is false as i 
			//	value should be less than num.length(2) .Hence Statement outside for loop executes
			System.out.println(num[i][j]);
			}
			}
		System.out.println("Two dimensional array completed");

	}

}
