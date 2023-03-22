package Assignment;

public class AssignmentException1 {
	public void display() {// method
		//before try - catch block
		String a = "I am error";
		System.out.println(a);
		try {
			//Arithmetic exception
			int i = 50/0;
			System.out.println(i);
			//Null pointer Exception
			String s = null;
			System.out.println(s.length());
			//ArrayIndexOutOfBound Exception
			}
		catch(Exception e) {
			System.out.println(e);
		}
		//after try - catch block
		String b = "The End";
		System.out.println(b);
	}
	public static void main(String[] args) {
		AssignmentException1 ep = new AssignmentException1 ();
		ep.display();
	}

}