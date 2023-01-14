package Package1;

public class ArrayReverse {
public static void main(String[] args) {
String s[]= {"Java","Selenium","Manual","Automation"};
for(int i=0;i<s.length;i++) {
System.out.print(s[i]+" ");
		}
System.out.println();
for(int j=s.length-1;j>=0;j--) {
System.out.print(s[j]+" ");
}

System.out.println();

int arr[]= {5,15,25,35,45,55,65,75,85,95};
for(int i =0;i<arr.length;i++) {
	System.out.print(arr[i]+"  ");
}
System.out.println();
for(int j=arr.length-1;j>=0;j--) {
	System.out.print(arr[j]+"  ");
}
	
System.out.println();

char ch[]= {'A','#','%','F','*','<'};
for(int i =0;i<ch.length;i++) {
	System.out.print(ch[i]+"  ");
}
System.out.println();
for(int j=ch.length-1;j>=0;j--) {
	System.out.print(ch[j]+"  ");
}


}

}
