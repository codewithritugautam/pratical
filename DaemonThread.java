package Thread;

public class DaemonThread extends Thread {
public void run() {
	if(Thread.currentThread().isDaemon()) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("I am Daemon");
	}
	else {
		System.out.println(" I am user" );
	}}
public static void main(String[] args) {
	DaemonThread t = new DaemonThread();
	DaemonThread t1 = new DaemonThread();
	DaemonThread t2 = new DaemonThread();
	t.setDaemon(true);
	t2.setDaemon(true);
	t.start();
	t1.start();
	t2.start();
	}
}

