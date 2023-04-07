package CollectionEg;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListCovertEg {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("Rose");
	a1.add("Sunflower");
	a1.add("lily");
	a1.add("Daisy");
	a1.add("marigold");
	a1.add("tulip");
	a1.add("lotus");
	a1.add("jasmine");
	//convertion of list to array
	System.out.println("List of array");
	//to Array() method used to convert list to array
	String [] arr = a1.toArray(new String[a1.size()]);
	for(String s: arr ) { //traversing using for each
		System.out.println(s);
	}
//array to list
	System.out.println("Array to list");
	List<String> a11 = new ArrayList<String>();
	a11=Arrays.asList(arr); //asList method convert array to list 
	System.out.println(a11);		
}
}
