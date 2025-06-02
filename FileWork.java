import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FileWork{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter fw;
		FileReader fr;
		File f;
	String fileName="myFile.txt";
	try{
		f=new File(fileName);
		f.createNewFile();
		System.out.println("File Created");

		FileOutputStream fo=new FileOutputStream(fileName);

		String data="Hello World This in my Program.";
		byte[] bytes=data.getBytes();
		fo.write(bytes);

		System.out.println("File Written");

		FileInputStream fi=new FileInputStream(fileName);
		int fd;
		while ((fd=fi.read())!=-1) {
			System.out.print((char)fd);			
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}