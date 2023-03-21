package Assignment;

public class UncheckedExcep {
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
			int arr[]= new int[5];
			arr[7]=10;
			//Number format exception
			String s1="Himanshu";
			int n = Integer.parseInt(s1);
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//after try - catch block
		String b = "The End";
		System.out.println(b);
	}
	public static void main(String[] args) {
	UncheckedExcep ep = new UncheckedExcep();
		ep.display();
	}
	
}
