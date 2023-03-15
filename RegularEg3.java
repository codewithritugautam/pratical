package controlstatement;

import java.util.regex.Pattern;

public class RegularEg3 {
public static void main(String[] args) {
	boolean b7 = Pattern.matches("[A-Za-z0-9+@+.]{18,}","Pallabi.Anudip@2023"); 
			System.out.println(b7);
			boolean b2 = Pattern.matches( "[0-9]{10}","9910837487");
			System.out.println(b2);
			boolean b3 = Pattern.matches( "[6789]{1}[0-9]{9}","9910837487");
			System.out.println(b3);
}
}
