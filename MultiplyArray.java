package controlstatement;

public class MultiplyArray {
	public static void main(String[] args) {
		 //create matrix
		 int a[][]={{1,1,1},{2,2,2},{3,3,3}};
		 int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		 // for storing result creating another matrix
		 int c[][]=new int[3][3];
		 //logic and printing 
		 for(int i=0;i<3;i++) { //printing row
			 for(int j=0;j<3;j++) { //printing column
				 c[i][j]=a[i][j]*b[i][j];
				 System.out.print(c[i][j]+ " "); 
			 }
				 System.out.println();
			 }
		 }
	 }
	


