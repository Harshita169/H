package cognizant;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		String path=("C:\\Users\\admin\\Desktop\\Java1\\data.txt");
		FileOutputStream out=new FileOutputStream(path,true);
		String message="The joining date was 28 jan";
		byte b[]=message.getBytes();
		out.write(b);
		out.close();

	}

}
