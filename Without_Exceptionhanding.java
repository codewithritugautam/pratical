package Assignment;
// with out try- catch
public class Without_Exceptionhanding {
public static void main(String [] args) {
	try {
		int num =10/0;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("the end");
	}
}

