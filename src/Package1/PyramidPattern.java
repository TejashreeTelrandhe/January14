package Package1;
public class PyramidPattern {
public static void main(String[] args) {
 for(int i =1;i<=8;i++) {//1  //2  //3  //4   //5  //6   //7   //8
 for(int j=1;j<=8;j++) {//1  //2  //3  //4   //5  //6   //7   //8
				 if(j>=9-i) {
			//1>=9-1>=8-false    //2>=9-1>=8-false     //3>=9-1>=8-false    //4>=9-1>=8-false
			//5>=9-1>=8-false    //6>=9-1>=8-false     //7>=9-1>=8-false    //8>=9-1>=8-true
					 
			//1>=9-2>=7-false    //2>=9-2>=7-false     //3>=9-2>=7-false    //4>=9-2>=7-false
			//5>=9-2>=7-false    //6>=9-2>=7-false     //7>=9-2>=7-true    //8>=9-2>=7-true
					 
			//1>=9-3>=6-false    //2>=9-3>=6-false     //3>=9-3>=6-false    //4>=9-3>=6-false
			//5>=9-3>=6-false    //6>=9-3>=6-true     //7>=9-3>=6-true    //8>=9-3>=6-true	
					 
			//1>=9-4>=5-false    //2>=9-4>=5-false     //3>=9-4>=5-false    //4>=9-4>=5-false
			//5>=9-4>=5-true    //6>=9-4>=5-true     //7>=9-4>=5-true    //8>=9-4>=5-true	
					 
			//1>=9-5>=4-false    //2>=9-5>=4-false     //3>=9-5>=4-false    //4>=9-5>=4-true
			//5>=9-5>=4-true    //6>=9-5>=4-true     //7>=9-5>=4-true    //8>=9-5>=4-true	
					 
			//1>=9-6>=3-false    //2>=9-6>=3false     //3>=9-6>=3-true    //4>=9-6>=3-true
			//5>=9-6>=3-true    //6>=9-6>=3-true     //7>=9-6>=3-true    //8>=9-6>=3-true	
					 
			//1>=9-7>=2-false    //2>=9-7>=2-true     //3>=9-7>=2-true    //4>=9-7>=2-true
			//5>=9-7>=2-true    //6>=9-7>=2-true     //7>=9-7>=2-true    //8>=9-7>=2-true			
					 
			//1>=9-8>=1-true    //2>=9-8>=1-true     //3>=9-8>=1-true    //4>=9-8>=1-true
			//5>=9-8>=1-true    //6>=9-8>=1-true     //7>=9-8>=1-true    //8>=9-8>=1-true			
					 System.out.print("* ");
				 }
           //       *
		   //      * *
           //     * * *	
		   //    * * * *
           //   * * * * *
		   //  * * * * * *
		   // * * * * * * *
		   //* * * * * * * *
		     else {
					 System.out.print(" "); }			 }
		 System.out.println();		 }
	}

}
