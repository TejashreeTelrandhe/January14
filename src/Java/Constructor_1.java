package Java;

public class Constructor_1 {
public Constructor_1(String name , int rollno) {
	System.out.println("name : "+name+" ,rollno : "+rollno);
}
public static void main(String[] args) {
	Constructor_1 c = new Constructor_1("Aditi",120);
	Constructor_1 c1 = new Constructor_1("Priti",121);
	Constructor_1 c2 = new Constructor_1("Shweta",122);
	Constructor_1 c3 = new Constructor_1("Komal",123);

}
}
