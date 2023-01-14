package Array;

public class Array_Two_Dimesion {

public static void main(String[] args) {
String ss [][]= new String [4][5];
ss[0][0]="object";
ss[0][1]="oriented";
ss[0][2]="java";
ss[0][3]="plaform";
ss[0][4]="independent";
ss[1][0]="class";
ss[1][1]="based";
ss[1][2]="programming";
ss[1][3]="desktop";
ss[1][4]="syntax";
ss[2][0]="language";
ss[2][1]="application";
ss[2][2]="organize";
ss[2][3]="scanner";
ss[2][4]="selenium";
ss[3][0]="grid";
ss[3][1]="remotely";
ss[3][2]="cross";
ss[3][3]="browser";
ss[3][4]="parameter";
for(int i = 0;i<=ss.length-1;i++) {
	for(int j = 0;j<=ss[0].length-1;j++) {
		System.out.print(ss[i][j]+" ");
	}
	System.out.println();
}
System.out.println();
System.out.println();
String s1 [][]= {{ "object","oriented", "java", "plaform", "independent"},
		{"class" ,"based", "programming", "desktop", "syntax"},
		{"language", "application", "organize", "scanner" ,"selenium"},
		{"grid", "remotely", "cross browser", "parameter"}};
for (int k = 0;k<=s1.length-1;k++) {
	for(int l =0;l<s1[0].length-1;l++) {
		System.out.print(s1[k][l]+" ");
	}
	System.out.println();
}
	}

}
