package CollectionEg;
import java.util.EmptyStackException;
import java.util.Stack;
//push() , pop() , search() , peek() , empty()
public class Stack {
	public static void main(String[] args) {
		//creating stack class
		Stack<Integer> s = new Stack<>();
		//create empty or not
		boolean result = s.isEmpty();
		System.out.println("is the stack empty?"+result);
		//adding element (push)
		s.push(25); //6 position
		s.push(20); //5 position
		s.push(15); //4 position
		s.push(56); //3 position
		s.push(75); //2 position
		s.push(43); //1 position
		s.push(34); // 0 position top most(L I F O) 
		s.add(5,22); //add index element 
		System.out.println("Stack element:" +s); //result
		Integer digit= s.peek(); //access element from the 
		System.out.println("Top element:" +digit);
		System.out.println("statck element after peek:"+s);
		Integer digit2 = s.pop();
		System.out.println("top element: "+digit2);
		System.out.println("stack element after pop " +s);
		int digit1 = s.search(75); //search any element
		System.out.println("search element:" +digit1);
		int x = s.size(); //find the size of the stack 
		System.out.println("stack size:"+x);
		result=s.empty(); //checking empty or not
		System.out.println(" is the stack empty ? "+result);
	}

}
