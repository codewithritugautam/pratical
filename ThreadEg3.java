package Thread;

public class ThreadEg3 extends Thread {
public void run() {
	for(int i =0 ;i<5;i++) {
		try {
			Thread.sleep(3100);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}}
//System.out.println(thread current thread().getName());
public static void main(String[] args) {
	ThreadEg3 t = new ThreadEg3();
	ThreadEg3 t1 = new ThreadEg3();
	ThreadEg3 t2 = new ThreadEg3();
	/*t.run();
	 * t1.run();
	 * t2.run();		}
	 */
	t.start();
	try {
		t.join();
	}catch(InterruptedException e) {
		System.out.println(e); }
	t.start();
	try {
		t1.join();
	}catch(InterruptedException e) {
		System.out.println(e);}
	t2.start();//t1.setName ("Thread Richa")
	
	}
}

