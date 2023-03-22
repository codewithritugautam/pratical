package Assignment;

public class AssignmentEceptionEg2 {
//division by zero
	public void division() {
		try {
			int i=50/0;
			System.out.println(i);
		}
		catch (Exception e) {
	System.out.println(e);
			System.out.println("Invalid division");
		}}
		//String parsed to a number variable 
		public void StringParsed() {
			try {
				String b ="RituGautam";
				int n = Integer.parseInt(b);
				System.out.println(b); 
			}
			catch(Exception e) {
				System.out.println(e);
				System.out.println("formet mismatch");
			}}
		//accessing an invalid calculator
		public void calculator() {
			try {
				int a = 50/0+96+45/0; }
			catch (Exception e) {
				System.out.println("Calcution invalid");
			}}
		 //Accessing an invalid index in array : Print "Array index is invalid"
		public void index() {
			try {
				int arr[] = new int [5];
				arr[7] = 10; }
			catch(Exception e) {
				System.out.println(e);
				System.out.println("Array index is invalid");
			}}
		//main method 
		public static void main(String[] args ) {
			System.out.println("Exception handling completed");
			AssignmentEceptionEg2 obj = new AssignmentEceptionEg2();
			obj.division();
			obj.StringParsed();
			obj.calculator();
			obj.index();
			}
		}
