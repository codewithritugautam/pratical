package Assignment;

public class ExceptionEG {
	public void display() { // method
		// before try - catch block
		String a = "I am error";
		System.out.println(a);
		try {
			//Arithmetic exception
			int i = 50/0;
			System.out.println(i);
			// after exception can't execute the other lines
			String s = "Himanshu";
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// after try - catch block
		String b = "I can not be handle";
		System.out.println(a +" "+ b); // I am error + I can not be handle
		}
	public static void main(String[] args) {
	ExceptionEG ep = new ExceptionEG();
	ep.display();
}
}

