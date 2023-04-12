package CollectionEg;
	import java.util.Iterator;
	import java.util.LinkedList;
	public class LinkedListmethod {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>(); //create list
		l1.add("Misbah");
		l1.add("Abhishek");
		l1.add("Atif");
		l1.add("Niladri");
		l1.add("Soumya");
		l1.add("Sourav");
	System.out.println("List 1 elements:"+""+l1);
	//retrives the 1st elements of the line--by default
	System.out.println(l1.peek());
	//retrives the 1st elements of the list
	System.out.println(l1.peekFirst());
	//retrives the last elements of the list
	System.out.println(l1.peekLast());
	//retrives and remove the 1st elements of the list--by default
	System.out.println(l1.poll());
	System.out.println("List 1 elements:"+""+l1);
	//retrives the 1st elements of the list
	System.out.println(l1.pollFirst());
	System.out.println("List 1 elements:"+""+l1);
	//retrieves the last elements of the list
	System.out.println(l1.pollLast());
	System.out.println("List 1 elements:"+""+l1);
	System.out.println(l1.poll());
	System.out.println("List 1 elements:"+""+l1);
	}
	}
