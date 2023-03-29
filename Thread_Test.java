package Thread;
	class Threadt1{
		synchronized void print(int num){//with synchronized method
	for(int i=1;i<=6;i++) {		
		System.out.println(num+i);
		try {
			Thread.sleep(100);//to break for sec to print one the thread
		}catch(InterruptedException e) {
			System.out.println(e);
		}}}}
	class Threadt2 extends Thread{
		Threadt1 mt;//aggregration-----call the reference variable
		Threadt2(Threadt1 mt){
			this.mt=mt;
		}
		public void run() {
		
			mt.print(9);//10,11,12,13,14,15
		}
	}
	class Threadt3 extends Thread{
		Threadt1 mt;//aggregration-----call the reference variable
		Threadt3(Threadt1 mt){
			this.mt=mt;
		}
		public void run() {
			mt.print(8);//9,10,11,12,13,14
		}
	}
	class Threadt4 extends Thread{
		Threadt1 mt;//aggregration-----call the reference variable
		Threadt4(Threadt1 mt){
			this.mt=mt;
		}
		public void run() {
			mt.print(7);//8,9,10,11,12,13
		}
	}
	public class Thread_Test {
		public static void main(String[] args) {
			Threadt1 o1= new Threadt1();//object of class1
			Threadt2 t1= new Threadt2(o1);//pass the object
			Threadt3 t2= new Threadt3(o1);
			Threadt4 t3= new Threadt4(o1);
			t1.start();
			t2.start();
			t3.start();
		}

	}

