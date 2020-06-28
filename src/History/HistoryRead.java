package History;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HistoryRead {

	public static void main(String[] args) throws IOException {
		
		
		String tokenHistory = "";
		Scanner scanner = new Scanner(new File("D:/out.txt")).useDelimiter("\r\n");
		List<String> historyList = new LinkedList<String>();

		// 텍스트 파일의 모든 문자열 불러옴 
		// 위에서 useDelimiter()사용하여 "\r\n" 기준으로 split함(각 문자열을 List안의  각각의 요소로 받기위해)
		while(scanner.hasNext()) {
			tokenHistory = scanner.next();
				
			historyList.add(tokenHistory);
			
			// historyList안에 문자열 20개 이상이면 문자열 첫줄 삭제(20개 될 때까지)
			while(historyList.size()>20) {
				historyList.remove(0);
			}
		}
			
		scanner.close();
		
		// 텍스트파일에서 가져온 historyList의 문자열, 화면에 출력
		for(int i=0; i<historyList.size(); i++) {
			System.out.println(historyList.get(i));
		
		// 텍스트파일의 문자열도 20줄로 초기화하기위해 사용
		PrintWriter history = new PrintWriter(new FileWriter("D:/out.txt"));
		
		for(int a=0; a < historyList.size(); a++) {
			history.println(historyList.get(a));
		}
		history.close();
	}
		
	}
}



