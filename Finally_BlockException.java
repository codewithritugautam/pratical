package Assignment;

public class Finally_BlockException {
   public static void main(String[] args) {
	   //exception not occure
	   try {
		   int a =4/2;
		   System.out.println(a);
	   }
	   catch (Exception e) {
		   System.out.println(e);
	   }
	 //exception occure
	   try {
		   int a =4/0;
		   System.out.println(a);
	   }
	   catch (Exception e) {
		   System.out.println(e);
	   }
	 //exception occure but not handle
	   try {
		   int a =4/0;
		   System.out.println(a);
	   }
	   catch (Exception e) {
		   System.out.println(e);
	   } 
	   finally {
		   System.out.println("Always finally block is execute");
	   }
   }
}
