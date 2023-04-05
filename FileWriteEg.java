package IO;
import java.io.FileReader;
import java.io.FileWriter;
public class FileWriteEg {
public static void main(String [] args) {
	try {
	FileWriter fw = new FileWriter("E:\\4119.text");
	fw.write("welcome to anudip foundation skill developement center");
		FileReader fr = new FileReader("E:\\secondFile.text");
		int i = 0;
		while((i= fr.read())!=-1) {
			System.out.println((char)i);
		}
		fw.close();
		fr.close();
		System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
		}
	}
}

