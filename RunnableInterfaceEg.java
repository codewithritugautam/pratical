package Thread;

public class RunnableInterfaceEg implements Runnable {
public void run() {
	System.out.println("Thread running");
}
public static void main(String[] args) {
	//creating object of RunnableInterfaceEg
	Runnable ri = new RunnableInterfaceEg();
	//Creating object of thread class using thread (Runnable ref ver,string numn)
	Thread t= new Thread(ri,"Ritu");
	t.start();
	String s = t.getName();
System.out.println(s);	

}
}
