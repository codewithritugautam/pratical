package controlstatement;
  // super keyword -- reference variable which  refer immedate perent class 
// 3 usage of super keyword 
// 3-- refer immediate parent class constructor
 class Shape2 { // parent class 
	 // constructor of parenrt class
	 Shape2() 
	 {
		 System.out.println("hello");
	 }
 }
class Size2 extends Shape2 { // child class
	// constructor of the child class
	Size2() {
		//invoke immediate parent class constructor line no 7 
		super();
		System.out.println("hii");
		}}
 class Supercons {
public static void main(String args[]) {
 Size2 obj= new Size2();// creating obj of child class
 }
}
