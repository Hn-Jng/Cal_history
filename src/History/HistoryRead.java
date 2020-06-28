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

		// �ؽ�Ʈ ������ ��� ���ڿ� �ҷ��� 
		// ������ useDelimiter()����Ͽ� "\r\n" �������� split��(�� ���ڿ��� List����  ������ ��ҷ� �ޱ�����)
		while(scanner.hasNext()) {
			tokenHistory = scanner.next();
				
			historyList.add(tokenHistory);
			
			// historyList�ȿ� ���ڿ� 20�� �̻��̸� ���ڿ� ù�� ����(20�� �� ������)
			while(historyList.size()>20) {
				historyList.remove(0);
			}
		}
			
		scanner.close();
		
		// �ؽ�Ʈ���Ͽ��� ������ historyList�� ���ڿ�, ȭ�鿡 ���
		for(int i=0; i<historyList.size(); i++) {
			System.out.println(historyList.get(i));
		
		// �ؽ�Ʈ������ ���ڿ��� 20�ٷ� �ʱ�ȭ�ϱ����� ���
		PrintWriter history = new PrintWriter(new FileWriter("D:/out.txt"));
		
		for(int a=0; a < historyList.size(); a++) {
			history.println(historyList.get(a));
		}
		history.close();
	}
		
	}
}



