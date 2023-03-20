package LogicalProgramTest;

import java.util.Arrays;

public class ReversWordOfString {
	public static void main(String [] args) {
		
		String str = "The Collection in Java is a framework";
		   // The Collection in Java is a krowemarf
		
		//System.out.println(str.replace("framework","krowemark"));
		
		  String[] word = str.split("\\s");
		  
		  for (int i = 0; i < word.length; i++) {
				String a = word[i];
				if (a.equals("framework")) {
					word[i] = "krowemarf";

				}
				
		  }
		  System.out.println(Arrays.toString(word));
		  
	}
}
