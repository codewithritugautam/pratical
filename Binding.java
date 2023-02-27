package controlstatement;
class TestBinding {
void show() { // dynamic binding
	System.out.println("is it clear");
}}
class Binding extends TestBinding {
	void show () {
		System.out.println(" override");
	}
	public static void main (String [] args) {
		TestBinding obj=new Binding() ;
		obj.show();
}
}
