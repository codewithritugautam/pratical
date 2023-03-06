package controlstatement;
  // odd number of columns known as a jaggedarray
public class Jaggedarray {
public static void main(String[] args) {
	//declare 2D array
	//declare no of row=3 but column=blank 
	int arr[] [] = new int[4][];
	//defining column 5+7+9=21
	arr[0]=new int[5];
	arr[1]=new int[10];
	arr[2]=new int[6];
	arr[3]=new int[10];
	//initialized the jaggedarray
	int count =0;
	for(int i=0;i<arr.length;i++) //row
		for(int j=0;j<arr[i].length;j++) //column
			arr[i][j]=count++;
	//print the jaggedarray
	for(int i=0;i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++) {
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
		}
	}
}

