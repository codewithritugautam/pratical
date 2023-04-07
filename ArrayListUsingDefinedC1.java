package CollectionEg;
import java.util.*;
import java.util.ArrayList;
class Bank{
	int no,age;
	String name;
	public Bank(int no , String name, int age) {
		this.no = no;
		this.name=name;
		this.age=age;
	}
}
public class ArrayListUsingDefinedC1 {
	
public static void main(String[] args) {
	Bank b = new Bank(24324, "ritu", 23);
	Bank b1 = new Bank(24325, "nidhi",20);
	Bank b2 = new Bank(24326, "sana",20);
	Bank b3 = new Bank(24327, "megha",18);
	Bank b4 = new Bank(24328, "pooja",24);
	
	ArrayList<Bank> a1 = new ArrayList<Bank>();
	a1.add(b);
	a1.add(b1);
	a1.add(b2);
	a1.add(b3);
	a1.add(b4);  
	
	Iterator itr = a1.iterator();
	while (itr.hasNext()) {
		Bank obj = (Bank) itr.next();
		System.out.println(obj.no+ " "+obj.name+ " "+obj.age);
	}
}
}
