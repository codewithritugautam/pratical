package controlstatement;
import java.util.Scanner;
class StringTest {
String x="hello";
public void show() { //method
	Scanner s = new Scanner (System.in); //user input
	System.out.println("Enter String"); //line no 1
	String A = s.next();
	String B = s.next();
	System.out.println(A.length()+B.length()); 
	System.out.println(A.compareTo (B)>0 ) ? "yes":"no"); //Compare to ()
	System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+ ""+B.substring(0,3).toLowerCase()
			+B.substring(1));
	//substring , Uppercase , Lowercase java
	System.out.println("Substring is :"+x.substring(0,3));
	System.out.println("Substring is:"+x.substring(2));
}
public static void main(String ...args) {
	StringTest t=new StringTest();
	t.show();
	}
}
