package IO;
//we can read single character ---- using fileinputStream
import java.io.*;

//import java.io.FileOutputStream;
public class SingleCharFIS {
public static void main(String[] args)  {
	try {
		FileInputStream f = new FileInputStream("E:\\4119.text"); 
		//read single character 
		int i=f.read(); { //b = 72(byte value)
			System.out.println((char)i);//convert it also character
		}
		f.close();
	}catch (Exception e) {
		System.out.println(e);
		}
	}
}

