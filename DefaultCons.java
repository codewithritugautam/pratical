package controlstatement;

public class DefaultCons {
	String name;
	DefaultCons(String name1){
		name = name1;
		System.out.println("Cons Called");
	}
	public static void main(String[] args) {
		DefaultCons obj = new DefaultCons("Java");
		DefaultCons obj1 = new DefaultCons("Python");
		System.out.println("The name is :"+obj.name);
		System.out.println("The name is :"+obj1.name);
	}
}