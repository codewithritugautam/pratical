package controlstatement;

public class newpatten {
	public static void main(String[] args) {
		for( int i=5; i>=1; i--) //outer loop for row number
		{
			if(i % 2 !=0) { //odd number 1,3,5
				for (int j =5 ; j>=i; j--) {  // odd position print star(*)
					System.out.print(" * ");
				}
				System.out.println();
			}
		}
		for(int i = 2; i<=5; i++)
		{
	if( i % 2 !=0) {
		for( int j=5; j>=i; j--) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	    }
		}
	}