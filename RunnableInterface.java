package Thread;
// if you are not extending the thread class the object is also no treated
// as a thread object we need to create thread class object explicitly
//we are passing object for our class which implement runnable so that class run() method execute but not start()
public class RunnableInterface implements Runnable {
	public void run() {
		System.out.println("I am Thread ....... thread is runnable");
	}
	public static void main (String[] args) {
		RunnableInterface ri =  new RunnableInterface();
		Thread t = new Thread(ri);
		t.start();
	}

}
