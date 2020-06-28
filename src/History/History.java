package History;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class History {

	public static void main(String[] args) throws IOException {

		
		
		PrintWriter history = new PrintWriter(new FileWriter("D:/out.txt", true));
		
		// 계산기 통해 입력받을 내용들
		
//		for(int i=0; i<30; i++) {
//			String data = i + " 번째 줄입니다.";
//			history.println(data);
//		}
		
		
		history.close();
		
		
	}

}
