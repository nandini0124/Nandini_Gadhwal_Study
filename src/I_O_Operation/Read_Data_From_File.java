package I_O_Operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_File {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("D://Java Flies//java.txt");
			br = new BufferedReader(fr);
			String line = " ";

			while (line != null) {
				line = br.readLine();
				System.out.println(line);
			}
		} catch (Exception ex) {
			System.out.println(ex);

		} finally {
			br.close();
		}

	}

}
