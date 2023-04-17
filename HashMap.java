package QueueIn;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class HashMap {
public static void main(String[] args) {
	//creating map
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(101,"Mango");
	map.put(102,"Orange");
	map.put(105,"Banana");
	map.put(108,null);
	map.put(104, null);
	map.put(null,"Apple");
	map.put(109,"Lichi");

	//traversing
	for(Map.Entry m: map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());}
		System.out.println("----------------------------------");
		map.putIfAbsent(107, "CustardApple");
		map.putIfAbsent(101, "Watermelon");
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	System.out.println("keys:"+map.keySet());
	System.out.println("Values:"+map.values());

	System.out.println("keys & values:"+map.entrySet());
	map.remove(103);
	for(Map.Entry m: map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());}
	}}