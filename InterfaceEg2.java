package controlstatement;

interface Shape{
void shape_name();
}
class user_circle implements Shape {
	public void shape_name() {
		System.out.println(" Draw a circle"); }
}
class user_traingle implements Shape {
	public void shape_name() {
		System.out.println(" Draw a circle");
	}
}
 public class InterfaceEg2 { //main class
	public static void main(String[] args) {
		Shape object =new user_traingle();
		object.shape_name();
	}
}