package Assignment;

public class AssignmentEceptionEg2 {
	public static void main(String[] args) {
		try {
			int i=50/0;
			System.out.println(i);
		}
		catch (ArithmeticException e) {
	System.out.println(e);
		}
			try {
				String s =null;
				System.out.println(s.length()); 
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
			try {
				int arr[] = new int [5];
				arr[7] = 10; 
				System.out.println(arr);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				String s1 ="Ritu"; 
				int n =Integer.parseInt(s1);
				System.out.println(n);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("Finally will be exceuted");
			}
			}
		}
