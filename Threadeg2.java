package Thread;
//Directly we use thread class without extend
//with & without set name we can name the tread
public class Threadeg2 {
public void run() {
	System.out.println("Ritu");
}
public static void main(String[] args) {
	//creating an object of the thread class saving the thread constructor
	Thread t = new Thread ("Richa");
	Thread t1 = new Thread();
//	Threadeg2 obj = new Threadeg2();
//	obj.run();
	t.start();
	t1.start();
	t1.setName("Anudip");
	System.out.println("Thread 0 : " + t.getName());
	System.out.println("Thread 1 : "+ t.getName());
}
}
