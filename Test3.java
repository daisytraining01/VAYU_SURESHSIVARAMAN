package Project;

import java.io.BufferedReader;
import java.io.IOException;

public class Test3 {

	
		public static void main(String[] args) {
			File file = new File("demo.txt");

			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


