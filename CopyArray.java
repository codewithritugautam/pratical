package Assignment2;

public class CopyArray {  //class
	public static void main(String[] args) {
		//declaring a source array
		char[] copyfrom = {'a','b','c','d','d','b','i','n'};
		//declaring a destination array
		char[]copyTo=new char[7];
		System.arraycopy(copyfrom,2,copyTo,1,3); 
		//print the destination array
		System.out.println(String.valueOf(copyTo));	
	}
}
