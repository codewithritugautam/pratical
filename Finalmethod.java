package controlstatement;
 // final keyword-----
// final method-- connot override the final method
class Finalmethod1 { // parent class
	final void display () {  // create a final method
		System.out.println ( " This is a final method.");
	}
}
class Child1 extends Finalmethod1 { // child class name main 
	// try to override final method 
	public final void show() {
		System.out.println(" The final method is override .");
	}
}
public class Finalmethod { // main class
	public static void main(String[] args) {
		Child1 obj = new Child1 ();
		obj.display();
	}
}
