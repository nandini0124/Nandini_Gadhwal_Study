package I_O_Operation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Write_Data {
	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter("D://Data.txt");
			bw=new BufferedWriter(fw);
			String s="nandini";
			bw.write(s);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			bw.close();
		}
	}
}
