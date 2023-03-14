package controlstatement;

public class ImmutableTest {
	public static void main(String[] args ) {
		String str="Richa";
		str.concat("Richa"); //insert the string at the end
		str=str.concat("Gautam"); //it will print RichaGautam
		System.out.println(str);
	}

}
