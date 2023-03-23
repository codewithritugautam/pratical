package Assignment;
//checked exception
import java.io.IOException;

class test { 
void display () throws IOException{ //user define method 
	//System.out.println("Throws exception perfectly");
	throw new IOException("Throws exception perfectly");//print this line("throws exception perfectly");
}
}
public class throws_Eg2{ //main class
	public static void main(String[] args) throws IOException {
	test obj = new test();
		obj.display();
	}
}
