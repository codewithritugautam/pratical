package IO;
//we can read All character ---- using fileinputstream 
import java.io.FileInputStream;
//read all character  
public class AllcharFIS {
	public static void main(String[] args)  {
		try {
			FileInputStream f = new FileInputStream("E:\\4119.text"); 
			int i=0; 
			while((i=f.read())!=1) { 
				System.out.println((char)i);//convert it also character
			}
			f.close();
		}catch (Exception e) {
			System.out.println(e);
			}
		}
	}


