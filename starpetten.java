package controlstatement;

public class starpetten{
		public static void main(String[]args) {
			for(int i=1; i<=10; i++)  // outer loop for row number
			{
				for ( int j=10; j>i;  j++) // inner loop for print space before star*
				{
				System.out.print(" ");
				}
					for( int k =10; k<=i; k--)
						{
						}
						System.out.print(" * ");
					}
					System.out.println();//new line		
		}}
