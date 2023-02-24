package controlstatement;
//we can't override static method
//parent class
 class Base { // parent class == 2 method add() non static 
	 // non-static method whic will be override
	 public int add(int a , int b) {
		 System.out.println(" In the base class");
		 return a+ b ;
	 }
	 // static method whic will not be override
	 // in the derived class
	 public static void print() {
		 System.out.println(" In the Base class: ");
	 }
 }
 // child class 
 class Derived extends Base { // Derived class
	 // this method overrides add() of Base Class
	 //because it not a static method 
	 public int add(int a, int b) {
		 System.out.println(" in the child class:");
		 return a+b;
	 }
	 //static method which will not be overridden
	 // in the derived class
	 public static void print( ) {
		 System.out.println( " In the base class:");
	 }
 }
 // main class
public class Staticcoverriden {
	public static void main(String args[]) {
		Base obj = new Derived();
		// here derived's add() is called
		// according to override rules
		System.out.println(obj.add(4,5));
		//this should invoke the print method of class Derived
		//as per override rules
		//Because a static method can't be override
		//it user Base'a print instand 
		obj.print();
	}
}
