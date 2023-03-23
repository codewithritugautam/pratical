package Assignment;

class InvalidAgeException extends Exception{
	public InvalidAgeException (String str) { //constructor
	super(str); //call the constructor of parent exception
	}
}

public class Custom_Excep {
static void checkage(int age) throws InvalidAgeException { //checkage method create
	if(age>25) {
		throw new InvalidAgeException ("not eligiable for java course");
	}
	else {
		System.out.println("Java course ragisters");
	}
}
//public static void main(String[] args) {
//	checkage(23);
//}
public static void main(String[] args) {
	try {
		checkage(23);
	}
	catch (InvalidAgeException e) {
		System.out.println(e);
	}
}
}
