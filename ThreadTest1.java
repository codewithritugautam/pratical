package Thread;
public class ThreadTest1 {
	public static void main(String[] args) {
		//creating an object of the thread class saving the thread constructor
		Thread t = new Thread ("ACBACBACBACBACBABCABCABCABCABC");
		t.start(); //save the active state  / CALL THE START METHOD
		System.out.println("Output Window : " + t.getName()); //print OUTPUT ACBACBACB.......	
	}}
