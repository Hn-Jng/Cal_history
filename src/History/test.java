package History;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class test {

	public static void main(String[] args) throws IOException {
		response.setContentType("text");
		   PrintWriter out = response.getWriter();
	       try {
	           FileReader logReader = new FileReader("D:/out.txt");
	           try {
	               BufferedReader buffer = new BufferedReader(logReader);
	               for (String line = buffer.readLine(); line != null; line = buffer.readLine()) {
	                   out.println(line);
	               }
	           } finally {
	               logReader.close();
	           }
	       } finally {
	           out.close();
	       }
	}

}
