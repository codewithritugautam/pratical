package controlstatement;
abstract class parentabs{
	parentabs(){ //cons
		System.out.println(" No-args Cons");
	}
	abstract void show(); // abstract method
	void run(){ //non abstract
		System.out.println("non abstract method");
	}	}
	class Childabs extends parentabs{
		void show() {
			System.out.println(" parent abstract method");
		}
}
public class AbstractclassEg {
public static void main(String[] args) {
	parentabs object = new Childabs();
	object.show();
	object.run();

}}
