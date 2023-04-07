package CollectionEg;
import java.util.ArrayList;
import java.util.List;
public class ArrayListMethod {
public static void main(String [] args) {
	List<String> a1 = new ArrayList<String>();
	a1.add("Rose");
	a1.add("Sunflower");
	a1.add("lily");
	a1.add("Daisy");
	a1.add("marigold");
	a1.add("tulip");
	String element = a1.get(2); //get()method
	System.out.println("Get index : "+element);
	System.out.println("Array list is :" + a1.isEmpty()); //isempty()
	String element1 = a1.remove(3);
	System.out.println("Remove index :" +element1);
	System.out.println("traversing using for loop");
	for(int i=0; i<a1.size(); i++) {
	System.out.println(a1.get(i));}
}
}
