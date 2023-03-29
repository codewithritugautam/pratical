package Thread;

public class Test implements Runnable {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new Test());
		t.start();
		System.out.println("Thread Started");
		t.join();
		System.out.println("Completed");
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
	}

}
