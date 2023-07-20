package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContent {

	public static void main(String[] args) throws IOException{
		File in=new File("C:\\Users\\MADHAV\\Desktop\\javap\\Cover letter.pdf");
		File out=new File("C:\\Users\\MADHAV\\Desktop\\copy.pdf");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		fis=new FileInputStream(in);
		fos=new FileOutputStream(out);
		System.out.println(fis.available());
		int i=0;
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
		if(fis!=null) {		
			fis.close();
		}
		if(fos!=null) {
			fos.close();
		}
	}
}
/*
 * srcfile originalfile   C:\Users\MADHAV\Desktop\javap\Cover letter.pdf
 * copy content location  C:\Users\MADHAV\Desktop\copy.pdf
 */
