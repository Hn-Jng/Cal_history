package History;

import java.io.*;


public class test2 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "D:/out.txt";
		DataInputStream reader = new DataInputStream(new FileInputStream(fileName));
		byte[] bytes = new byte[10];
		reader.read(bytes);
		String content = new String(bytes);
		reader.close();

		System.out.println(content);
		
	
		}


	}


