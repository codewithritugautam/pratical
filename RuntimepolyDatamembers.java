package controlstatement;
//runtime polymorphism and achieved by data member
public class RuntimepolyDatamembers {
public static void main(String[] args) {
	papa_mumma object;
	 object = new Children ();
	System.out.println(object.Priority);
}
	
}
 class papa_mumma{ //base class
	 String Priority = " High";
 }
 class Children extends papa_mumma { //child class
	 String priority ="Super_high ";
 }