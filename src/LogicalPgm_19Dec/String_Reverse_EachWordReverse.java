package LogicalPgm_19Dec;

public class String_Reverse_EachWordReverse {

public static void main(String[] args) {
String s="Selenium webbed automation tool";
System.out.println(s.length());
String ss ="";
for(int i=s.length()-1;i>=0;i--) {
	ss=ss+s.charAt(i);
//	System.out.println(ss);
}
  System.out.println(ss);//loot noitamotua debbew muineleS
  
System.out.println();
String s1 = "Selenium webbed automation tool";
String Reverse ="";
String word [] = s1.split(" ");
for(String W : word) {
	System.out.println(W);
//	Selenium
//	webbed
//	automation
//	tool
	String Reverseword = "";
	for(int i= W.length()-1;i>=0;i--) {
		Reverseword = Reverseword + W.charAt(i);
}
	Reverse =Reverse +Reverseword+" ";
}
System.out.println(Reverse);//muineleS debbew noitamotua loot 

System.out.println();

String s2 ="Selenium supports different language like java, perl, python, c# etc.";
String RevWord ="";
String words []= s2.split(" ");
for(String WW: words) {
	System.out.println(WW);
//	Selenium
//	supports
//	different
//	language
//	like
//	java,
//	perl,
//	python,
//	c#
//	etc.
	String Rev = "";
	for(int j=WW.length()-1;j>=0;j--) {
		Rev = Rev + WW.charAt(j);
}
	RevWord =RevWord + Rev+" ";
}
System.out.println(RevWord);//muineleS stroppus tnereffid egaugnal ekil ,avaj ,lrep ,nohtyp #c .cte 

}
}
