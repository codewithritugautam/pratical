package Thread;
	class Syncl {
		int i;
		boolean flag = false;
		synchronized void display(int i) {
			if(flag) //check condition
				try {
					wait();
				}
			catch(InterruptedException ie) {
			System.out.println(ie);
		}
			this.i=i;
			flag=true;
			System.out.println("Data display:"+i);
			flag= false;
			notify();
		}
		synchronized int receive() {
			if(!flag)
				try {
					wait();
				}
			catch(InterruptedException ie) {
			System.out.println(ie);
			}
			System.out.println("Data received:"+i);
			flag = false;
			notify();
			return i;
		}
	}
	class First_Thread1 extends Thread{
		Syncl obj;
		First_Thread1(Syncl obj) {
			this.obj=obj;
		}
		public void run() {
			for(int j=1; j<=10;j++) {
				obj.display(j);
			}
		}
	}
	class Second_Thread2 extends Thread{
		Syncl obj;
		Second_Thread2(Syncl obj) {
			this.obj=obj;
		}
		public void run() {
			for(int j=1;j<=10;j++) {
				obj.receive();
			}
		}
	}
	public class Inter_Thread_Com2 {
		public static void main(String[] args) {
			Syncl obj=new Syncl() ;
			First_Thread1 t= new First_Thread1(obj);
			Second_Thread2 t1 = new Second_Thread2(obj);
			t.start();
			t1.start();
		}
	}


