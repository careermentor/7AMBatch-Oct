package testPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{

	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./MyFolder/file4.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("browser"));
		
	}
	
	
	public static void writedata() throws Exception
	{
		
		File f = new File("./MyFolder/file3.txt");  //file connection
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nthis is forth line");
		fw.flush();  //save
		fw.close();
	
	}
	
	public static void readdata() throws Exception
	{
		
		//File f = new File("C:\\Users\\Santosh\\Desktop\\file1.txt");  //file connection
		
		File f = new File("./MyFolder/file2.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read(); //116
		
		
		
		while(r!=-1)  //116!=-1 (true), 104!=-1 (true). 105!=-1 (true), -1!=-1(false)
		{
			System.out.print((char)r);  //th
			r = fr.read();  //h=104, 
		}
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		FileHandling.readprop();
	}
	
}
