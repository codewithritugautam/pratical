package Assignment2;
//to get the class name of array object in java
public class ClasssNameArray {
public static void main(String[] args) {
	//declaration & initialization of an array
	double arr[] = {1,2,3};
	//getting the class name
	Class a=arr.getClass();
	String name= a.getName();
	//print the class name
	System.out.println(a);
}
}
