package Assignment;
//constructor can throw an exception
public class Throws_with_con {
String name;
int age;
public void Throws_with_Con(String name, int age) throws Exception{
	if(age <18) {
		throw new Exception("Age Should be more then 18");
	}
	this.name=name;
	this.age=age;
}
public static void main(String[] args) throws Exception {
	Throws_with_con obj = new Throws_with_con("ritu",20);
	System.out.println(obj.age + " " +obj.age);
}
}
