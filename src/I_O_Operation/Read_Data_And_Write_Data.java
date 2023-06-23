package I_O_Operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Read_Data_And_Write_Data {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = read();

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("D://Data.txt",true);
			bw = new BufferedWriter(fw);

			for (String s : list) {
				if(s != null)
				bw.write(s);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			bw.close();
			fw.close();
		}

	}

	private static ArrayList<String> read() {
		ArrayList<String> list = new ArrayList<>();
		
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("D://Java Flies//java.txt");
			br = new BufferedReader(fr);
			String line = " ";
			while (line != null) {
				line = br.readLine();
				//System.out.println(line);
				list.add(line);

			}
			br.close();
			fr.close();

		} catch (Exception e) {
			System.out.println(e);

		}
		return list;
	}
}
