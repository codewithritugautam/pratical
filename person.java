package Mypackage;

public class person { //class
private String name; // instance variable 
private int age;
person(String name,int age){ //constructor
	this.name=name;
	this.age=age;
	System.out.println("name"+name);
	System.out.println("age"+age);
}
}
