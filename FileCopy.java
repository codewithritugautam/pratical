package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileCopy {
public static void main(String[] args) {
	try {
		FileInputStream fin= new FileInputStream("E:\\4119.text"); //Read
		FileOutputStream fout = new FileOutputStream("E:\\secondFile.text");//write
		byte[] arr = new byte[1024];
		int l;
		while((l=fin.read(arr)) >0) {
			fout.write(arr);
		}
		fin.close();
		fout.close();
		System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
		}
		
}}

