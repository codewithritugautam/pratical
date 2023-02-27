package controlstatement;
//static binding (private ,final,static)
 class Binding1 {
private void display() {
	System.out.println(" Something");
}
public static void main(String[] args) {
	Binding1 obj = new Binding1 ();
	obj.display();
}
}
