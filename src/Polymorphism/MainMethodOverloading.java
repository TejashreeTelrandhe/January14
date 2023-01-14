package Polymorphism;

public class MainMethodOverloading {

	public static void main(String[] args) {
    System.out.println("Main method having String argument");
    System.out.println("String argument main method is only executed "
    		+ "rest other will not be executed");
    System.out.println("Main Method can be overloaded");
	}
    public static void main(int[] args) {
	System.out.println("Main method having int argument");
	}
    public static void main(char[]args) {
    	System.out.println("Main method having char argument");
    }
    public static void main(String []args, int [] arr) {
    	System.out.println("Main method having String and int argument");
    }
}
