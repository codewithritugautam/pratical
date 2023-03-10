package Assignment2;

public class ClonningAnArray {
	public static void main(String[] args[]) {
		int[] arr= {11,2,3,4}; //declaring & initializing
		System.out.println("print the actual array");
		for(int i:arr) //for each loop for print
			System.out.println(i); //print
				System.out.println("print the close array");
				int carr[] = arr.clone(); //creating clone
				for(int i:carr) //for each loop for cloning array
					System.out.println(i);
				System.out.println("both are equal ar not?");
				System.out.println(arr==carr);//checking 
	}}
