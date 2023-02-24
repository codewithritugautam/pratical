package controlstatement;
// final keyword
public class BlankFinalvariable {
final int value; // blank initialization of final variable
BlankFinalvariable() { // default constructor
	value =70;
	System.out.println(value);
	//we can't change the value of final variable
	// compile the error 
}
public static void main(String args[]) {
	BlankFinalvariable fv= new BlankFinalvariable(); // creating object 
}
}
