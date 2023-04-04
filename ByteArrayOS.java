package IO;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*ByteArrayOutputStream class is used to write same
 data info multiple files,the data is written into a
  byte array,which can be written to multiple stream later */
public class ByteArrayOS {
public static void main(String[] args) throws IOException{
	//can be written to multiple stream
	FileOutputStream f= new FileOutputStream("E:\\4119.text");
	FileOutputStream f1= new FileOutputStream("E:\\secondFile.text");
	ByteArrayOutputStream bt= new ByteArrayOutputStream ();
	//one message  send into multiple stream
	bt.write(65);//ASCII value 65 is A
	bt.writeTo(f);
	bt.writeTo(f1);
	bt.flush();
	bt.close();
	System.out.println("done");
}
}