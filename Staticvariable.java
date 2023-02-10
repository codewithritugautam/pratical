package controlstatement;

 class Staticvariable1 {

	int rollno;
	float fee;
	String name;
	static String college=" VMLG";
	//static void change()
	//college="ITD"l;
	//constructor
	Staticvariable1 ( int rollno, String name, float Fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	}
	 //method
	 void display(){ //main class
	System.out.println(rollno+" "+name+" "+fee+" "+college);
	}}
	public class Staticvariable {//class 2
	public static void main(String[] args) {
			//staticvariable1.change();
			//objects
	Staticvariable1 s1= new Staticvariable1(111,"Richa",20000);
	Staticvariable1 s2= new Staticvariable1(555,"nidhi",20000);
	s1.display(); // display the data
	s2.display();
		}
	}



