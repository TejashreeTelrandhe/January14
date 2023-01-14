package Package2;

public class StingArrayTwoDiPractice2 {

	public static void main(String[] args) {
String str [][]= {{"File","Edit","Help","Java","Even"},{"Gmail","Photo","Users","Colon","Array"},{"String","Source","Window","Search","Number"}};
System.out.println(str.length);
System.out.println(str[0].length);

for(int i =0;i<str.length;i++) {
	for(int j =0;j<str[0].length;j++) {
		System.out.print(str[i][j]+"    ");
	}
	System.out.println();
}

System.out.println(str[0][4]);

}

}
//File      Edit        Help        Java       Even
//Gmail     Photo       Users       Colon      Array
//String    Source      Window      Search     Number