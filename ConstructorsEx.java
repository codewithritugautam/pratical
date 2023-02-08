package controlstatement;

public class ConstructorsEx {
	ConstructorsEx(){ //default constructor
		System.out.println("Default");
	}
		int sum;
	    ConstructorsEx(int a, int b){ //parameterized constructor
	    sum=a+b;
	    }
	  void show(){
      System.out.println("sum : "+sum);
	  } 
	  public static void main(String args[]) {
		  ConstructorsEx obj = new ConstructorsEx();
	      ConstructorsEx obj1 = new ConstructorsEx(20,30);
	      obj1.show();
	  }
	}


