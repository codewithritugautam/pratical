package Assignment;

import java.util.Scanner;

public class InputMismatchExc {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter any two number");
	try {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("result:" + x/y);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	}
}
