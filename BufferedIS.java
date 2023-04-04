package IO;
import java.io.*;
public class BufferedIS {
public static void main(String[] args) {
	try {
		//source file
		FileInputStream f = new FileInputStream("E:\\4119.text");
		BufferedInputStream b = new BufferedInputStream(f);
		int i;
		while ((i=b.read())!=-1) {
			System.out.println((char)i); //convert it into character
		}
		f.close();
		b.close();
	} catch(Exception e) {
		System.out.println(e);
		}
	}
}

