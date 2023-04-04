package IO;
import java.io.FileOutputStream;
//write String to Byte Array--- write byte file output stream
public class WriteByteFOS {
public static void main(String[] args) {
	try {
		FileOutputStream f = new FileOutputStream("E:\\4119.text"); 
		String s = " Welcome to Anudip foundation";
		byte b[] = s.getBytes(); //converting String into byte array
		f.write(b);
		f.close();
		System.out.print("Done");
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
