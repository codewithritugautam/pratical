package controlstatement;

public class Differentclassname {
int age;
	String name;
	void show() { //method to display age and name (User Defined)
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		//1st object for name & age
		Differentclassname obj = new Differentclassname();
		// 2nd object for name & age
		Differentclassname obj1 = new Differentclassname();
		obj.show();
		obj1.show();
		Differentclassname obj2 = new Differentclassname();
		obj2.age=100;
		obj2.name="Java";
		System.out.println(obj2.age+" "+obj2.name);
	}
}