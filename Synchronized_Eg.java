package Thread;
//with/without using sy
class Synchro_Test {
synchronized void display(int num) {
	for(int i=1;i<=5;i++) {		
		System.out.println(num+i);
		try {
			Thread.sleep(100);//to break for sec to print one the thread
		}catch(InterruptedException e) {
			System.out.println(e);
		}}}}
public class Synchronized_Eg {
			public static void main(String[] args) {
	Synchronized_Eg s1= new Synchronized_Eg();
	
Thread t1= new Thread() {
public void show() {
	s1.display(2);
}};
Thread t2= new Thread(){
public void show() {
	s1.display(5);
}
};
t1.start();
t2.start();
}

			protected void display(int i) {
				// TODO Auto-generated method stub
				
			}
		}

