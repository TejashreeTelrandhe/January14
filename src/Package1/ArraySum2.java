package Package1;

public class ArraySum2 {

	public static void main(String[] args) {
		double d[]= {5.23,15.25,25.12,28.11,35.03,55.001};
	double	sub = d[0]; //5.23    //15.25   //25.12      //28.11   //35.03    //55.001
	
	System.out.println(d.length);
	for(int i =0; i<d.length; i++) {//0
		sub = sub - d[i];//5.23-5.23-15.25-25.12-28.11-35.03-55.001
	}
	System.out.println("Substraction of elements: "+sub);
	}
}
