package Package1;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		for(int i = 0;i<=8;i++) {//0   //1  //2  //3  //4  //5  //6  //7   //8

		for(int j = 0;j<=8;j++) {//0   //1  //2  //3  //4  //5  //6  //7   //8
		
			if(j<=i) { // i=0 
			//0<=0-true    // 1<=0- false   // 2<=0- false // 3<=0- false // 4<=0- false   
			// 5<=0- false // 6<=0- false  //7=0-false  //8=0-false
			
			//i=1		
           //0<=1-true //1<=1-true  //2<=1-false  //3<=1-false //4<=1-false 
		  //5<=1-false //6<=1-false  //7<=1-false   //8<=1-false
				
		  //i=2		
		 //0<=2-true //1<=2-true  //2<=2-true  //3<=2-false //4<=2-false 
		 //5<=2-false //6<=2-false  //7<=2-false   //8<=2-false
				
		//i=3		
		//0<=3-true //1<=3-true  //2<=3-true  //3<=3-true //4<=3-false 
		//5<=3-false //6<=3-false  //7<=3-false   //8<=3-false
				
				//i=4		
				//0<=4-true //1<=4-true  //2<=4-true  //3<=4-true //4<=4-true 
				//5<=4-false //6<=4-false  //7<=4-false   //8<=4-false
				
				//i=5		
				//0<=5-true //1<=5-true  //2<=5-true  //3<=5-true //4<=5-true 
				//5<=5-true //6<=5-false  //7<=5-false   //8<=5-false
				
				//i=6		
				//0<=6-true //1<=6-true  //2<=6-true  //3<=6-true //4<=6-true 
				//5<=6-true //6<=6-true  //7<=6-false   //8<=6-false
				
				//i=7		
				//0<=7-true //1<=7-true  //2<=7-true  //3<=7-true //4<=7-true 
				//5<=7-true //6<=7-true  //7<=7-true   //8<=7-false
				
				//i=8		
				//0<=8-true //1<=8-true  //2<=8-true  //3<=8-true //4<=8-true 
				//5<=8-true //6<=8-true  //7<=8-true   //8<=8-true
				System.out.print("*");
				//*
				//**
				//***
				//****
				//*****
				//******
				//*******
				//********
		}
		}
			System.out.println(" ");
		}
	}
}

