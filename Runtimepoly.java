package controlstatement;
// Runtime polymorphism -- Dynamic method dispatch
//overload a static method in java - compile is time poly
public class Runtimepoly {
public static void main(String [] args) {
	Java_student js; //reference variable of parent class
	js = new Sana ();
	System.out.println(" Quality of sana is: " +js.quality());
	js = new Ritu();
	System.out.println(" Quality of Ritu is : " +js.quality());
}
// overridden method called by the reference variable of parent class 
	// overridden method is resolved at runtime rather than compile time
}
class Java_student { //parent class
	String quality() {
		return null;
	}
}
class Ritu extends Java_student{ //child class 1
	String quality() { //overridden method
		return "Artist";
	}
}
class Hement extends Java_student{ //child class 2
	String quality() { 
		return "active";
	}
}
class Sana extends Java_student{ //child class 3
	String quality() {
		return "good nature";
	}
}
class Prince extends Java_student{ //child class 4
	String quality() {
		return "error";
	}
}
