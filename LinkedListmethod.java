package CollectionEg;
import java.util.Iterator;
import java.util.LinkedList;
//other method combination
public class LinkedListmethod {
public static void main(String[] args) {
	LinkedList<String> 11=new LinkedList<String>(); //create list 1
	11.add("nisha");
	11.add("ritu");
	11.add("upasana");
	11.add("megha");
	11.add("sana");
	11.add("nidhi");
	System.out.println("List 1 element:"+ " "+11);
	//retrieves the 1st element of the list ------ by default
	System.out.println(11.peek());
	//retrieves the 1st elements of the list
	System.out.println(11.peekFirst());
	//retrieves the 1st elements of the list
	System.out.println(11.peelLast());
	//retrieve and remove the 1st elements of the list-- by default
	System.out.println(11.poll());
	System.out.println("List 1 element:"+""+11);
	//retrieves the 1st last elements of the list
	System.out.println(11.pollFirst());
	System.out.println("List 1 element:"+""+11);
	//retrieves the last elements of the list 
	System.out.println(11.pollLast());
	System.out.println("list 1 element:"+""+11);
	System.out.println(11.pop());
	System.out.println("List 1 element:"+""+11);
}
}
