package Mypackage;
// if we create a fully encapsulation class in java then we have to make all
// the data member of the class private 
// we can use setter getter method 
public class Encapsulation { //create a class 
private String name; //instance variable 
private int age;
public String getName() { 
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
