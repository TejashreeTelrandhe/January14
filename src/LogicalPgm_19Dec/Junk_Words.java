package LogicalPgm_19Dec;

public class Junk_Words {

	public static void main(String[] args) {
		String a = "j@#$% *u@$#@ n*^%$#k!@$%%w o!@# r*^%$d";
		a= a.replaceAll("[^a-z]", "");
		System.out.println(a);
		
		
		String b = "J!@# U#$% n*&^ k@#$W %$# o ^%$#R@@@ d";
		b = b.replaceAll("[^A-Z,a-z]", "");
		System.out.println(b);
		
		
		String c = "T!#e****j #as *() hree@99";
		c=c.replaceAll("[^A-Z,a-z,@,9]", "");
		System.out.println(c);
	}

}
