package controlstatement;

public class ParametreizedCons {
	int age;
	String name;
	// parameterized cons where we have to pass the parameter / arguments
	ParametreizedCons(int a, String n){
		age = a;
		name = n;
	}
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		ParametreizedCons obj = new ParametreizedCons(22,"ritu");
		ParametreizedCons obj1 = new ParametreizedCons(24,"rahul");
		obj.show();
		obj1.show();
	}
}


