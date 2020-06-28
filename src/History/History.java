package History;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class History {

	public static void main(String[] args) throws IOException {

		
		
		PrintWriter history = new PrintWriter(new FileWriter("D:/out.txt", true));
		
<<<<<<< HEAD
		// °è»ê±â ÅëÇØ ÀÔ·Â¹ÞÀ» ³»¿ëµé
=======
		// ê³„ì‚°ê¸° í†µí•´ ìž…ë ¥ë°›ì„ ë‚´ìš©ë“¤
>>>>>>> a038463c05e1c8ccc468a979cafb0ba50d725cbc
		
//		for(int i=0; i<30; i++) {
//			String data = i + " ë²ˆì§¸ ì¤„ìž…ë‹ˆë‹¤.";
//			history.println(data);
//		}
		
		
		history.close();
		
		
	}

}
