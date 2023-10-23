package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String data = "Writing in myfile";
				try {
				FileOutputStream fos =new FileOutputStream("MyFile.txt");
				byte [] byteData=data.getBytes();
				fos.write(byteData);
				fos.close();
				}
				catch(IOException ex)
				{
					System.out.println(ex);
				}
			}

}


