package Package1;

public class GNSVfromdifferentclasspractice {
	public static void main(String[] args) {
//		If we have to call non static GV from different class then
//      we have to create object for that class and use Syso(Ref.NSGVariablename)
		GNSVfromsameclasspractice  P = new GNSVfromsameclasspractice ();
		System.out.println(P.college);
		System.out.println(P.courses);
		System.out.println(P.admission);
}}
