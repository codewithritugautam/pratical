package IO;

import java.io.FileOutputStream;
public class WriteStringFOS {
public static void main(String[] args) {
	try {
		//write byte to string
		FileOutputStream f = new FileOutputStream("E:\\4119.text"); 
		//write byte to string
		f.write(65);
		f.close();
		System.out.println("done");
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
