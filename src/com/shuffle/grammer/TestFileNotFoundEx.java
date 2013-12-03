package com.shuffle.grammer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileNotFoundEx {

	/**
	 * @throws IOException 
	 * @Title: main
	 * @Description: FileNotFoundException,IOException
	 * @param args
	 * @return void
	 * @author sunzhongyi
	 * @throws
	 */
	public static void main(String[] args)  {
		FileInputStream in = null;
		try{
			in = new FileInputStream("myfile.txt");
			int b = in.read();
			while(b!=-1){
				b = in.read();
			}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
