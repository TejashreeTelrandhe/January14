package LogicalPgm_19Dec;

public class Character_Occurence {

	public static void main(String[] args) {
String str = "Character occurence in specific string";
char search ='e';
int count =0;
for(int i =0;i<str.length();i++) {
	if(str.charAt(i)==search) {
		count++;
	}
}
System.out.println(count);
	}

}
