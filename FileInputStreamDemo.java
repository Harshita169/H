package cognizant;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
public static void main(String[] args) throws FileNotFoundException, IOException 
{
	String path="C:\\Users\\admin\\Desktop\\Java1\\data.txt";
	String newPath="C:\\Users\\admin\\Desktop\\Java1\\copy.txt";
	File file=new File(path);
	FileInputStream in=new FileInputStream(file);
	BufferedInputStream bin=new BufferedInputStream(in);
	FileOutputStream out=new FileOutputStream(newPath);
	BufferedOutputStream bout=new BufferedOutputStream(out);
	int i;
	while((i=bin.read()) != -1)
	{
		bout.write(i);
	}
	bout.close();
	}
}
