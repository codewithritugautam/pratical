package controlstatement;
	interface New_Employee{ //parent Interface 1
		void salary();
	}
	 interface New_Developer { //parent interface2
	 void salary(); // abstract method Bonus for parent interface 2
	 }
class New_Trainer implements New_Employee,New_Developer{
		public void salary() {
			System.out.println(" Bonus will be 10% of salary");
	}
	public class MultipleIn_Interface_Eg2 {
	public static void main(String[] args) {
		New_Trainer object = new New_Trainer() ;
		object.salary();
	}}}
