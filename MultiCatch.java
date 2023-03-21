package Assignment;

public class MultiCatch {
static void myFunc() {
	try {
		int i =50/0;
		System.out.println(i); //Arithmetic
		int arr[] = new int [3];
		arr[7] = 24;
	}
	catch(ArithmeticException e) {
		System.out.println("only 1st Arithmetic exception will execute");
	}
	catch (ArrayIndexOutOfBoundsException ae) {
		System.out.println("New Array index out of bound will occure");
	}
	finally {
		System.out.println("Now Array Index out of bound will occure");
	}
}
public static void main(String[] args) {
		}
}
