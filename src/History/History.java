package History;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class History {

	public static void main(String[] args) throws IOException {

		
		
		PrintWriter history = new PrintWriter(new FileWriter("D:/out.txt", true));
		
		// ���� ���� �Է¹��� �����
		
//		for(int i=0; i<30; i++) {
//			String data = i + " ��° ���Դϴ�.";
//			history.println(data);
//		}
		
		
		history.close();
		
		
	}

}
