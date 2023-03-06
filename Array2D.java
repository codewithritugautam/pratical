package controlstatement;
//multidimensional Array
public class Array2D {
public static void main(String[] args) {
	//declaration & initializing 2D array
	int arr[] [] = {{2,5,6},{4,5,6}};
	for(int i=0; i<2; i++) { //for printing row
		for(int j=0;j<3;j++) {//for printing column
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
	}
}
}
