package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="Java is an Amazing language";
		try {
		FileInputStream fis= new FileInputStream("MyFile.txt");
	    int i=0;
	    while((i=fis.read())!=-1)
	    {
	    	System.out.print((char) i);
	    }
	    fis.close();
		
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}

}
