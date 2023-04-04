package IO;
import java.io.*;
public class BufferedOS {
public static void main(String[] args) {
	try {
		//we connected one stream (FileOutputstream)with another (Buffered)
		FileOutputStream f = new FileOutputStream("E:\\\\4119.text"); //Destination
				BufferedOutputStream b = new BufferedOutputStream(f);
				String s = "welcome to codeing word";
				byte b1[] = s.getBytes(); //converting String into byte array
				f.write(b1);
				b.flush(); //flush the data of one stream and send it into another		
				f.close();
				b.close();
				System.out.println("Done");
				}
				catch (Exception e) {
					System.out.println(e);
				}
				}
}

