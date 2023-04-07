package CollectionEg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 public class ArrayListConvert {
	public static void main(String[] args) {

 List<String> a1 = new  ArrayList<String>();
a1.add("Rose");
a1.add("Sunflower");
a1.add("lily");
a1.add("Daisy");
a1.add("marigold");
a1.add("tulip");
a1.add("lotus");
a1.add("jasmine");

System.out.println("traversing using for loop");
for(int i=0 ; i<a1.size();i++) {
	System.out.println(a1.get(i));
}
System.out.println("traversing using for each loop");
for(String a : a1) {
	System.out.println(a);
}
System.out.println("traversing using for interator");
Iterator itr = a1.iterator();
while(itr .hasNext()) {
	System.out.println(itr.next());
}
System.out.println("traversing using for iterator-forword");
ListIterator<String> itr1 = a1.listIterator();
while (itr1.hasNext()) {
	System.out.println(itr1.next());
}
System.out.println("traversing using for iterator-backword");
ListIterator<String> itr2 = a1.listIterator(a1.size());
while (itr2.hasPrevious()) {
	System.out.println(itr2.previous());
}
System.out.println("traversing using for each () method");
a1.forEach(a-> System.out.println(a));
}
}