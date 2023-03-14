package controlstatement;

import java.util.StringTokenizer;

public class StringTokenizer { //class
public static void my() { //my method
	StringTokenizer t=new StringTokenizer("Anudip foundation skill and carrer development center");
	while(t.hasMoreTokens()) { //boolean method if there is more token available or not
		System.out.println(t.nextTokens(" ")); //string method if return the next string token
	}
	StringTokenizer st = new StringTokenizer("I am & Ritu & Ghaziabad");
	while(st.hasMoreTokens()) {
		System.out.println(st.NextTokens("&"));
	}}
public static void main(String[] args) {
	my();
}
}
