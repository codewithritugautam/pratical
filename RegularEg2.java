package controlstatement;

import java.util.regex.Pattern;

public class RegularEg2 {
public static void main(String[] args) {
	boolean b1 = Pattern.matches("[a-zA-Z]","R");
	boolean b2 = Pattern.matches("[pqr]","pqr");
	boolean b3 = Pattern.matches("[^abc]","s");
	System.out.print(b1+" "+b2+" "+b3+" ");
}
}
