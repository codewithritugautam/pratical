package QueueIn;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class HashMapEg {
	public static void main(String[] args) {
		//creating map
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(101,"Mango");
		map.put(102,"Banana");
		map.put(105, "Apple");
		map.put(null, null);
		map.put(103, null);
		
		//traversing 
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}