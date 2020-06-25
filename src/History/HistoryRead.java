package History;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HistoryRead {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("D:/out.txt"));
		
		for(int i=-1; i>-20; i--) {
			String line = br.readLine();
	
			System.out.println(line);
		}
		br.close();
	}

}
