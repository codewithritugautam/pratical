package QueueIn;
import java.util.Map;
import java.util.TreeMap;

 class TreeMapEg {
	 public static void main(String[] args) {
		TreeMap<Integer, String>map2 = new TreeMap<Integer,String>();
		map2.put(101,"mango");
		map2.put(108,"orange");
		map2.put(105,"banana");
		map2.put(103,"grapes");
		map2.put(105,"banana");
	map2.put(107, null);
	System.out.println(map2);
	map2.putIfAbsent(102,"CustardApple");
	map2.putIfAbsent(101,"Watermelon");
	System.out.println("--------------");
	for(Map.Entry m: map2.entrySet()) {
		System.err.println(m.getKey()+" "+m.getValue());
		
	}
map2.remove(103);
System.out.println("----------");
System.out.println("After removal");
for(Map.Entry m :map2.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	
}
	 }}