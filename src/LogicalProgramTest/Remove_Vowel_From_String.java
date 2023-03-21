package LogicalProgramTest;

import java.util.Arrays;

public class Remove_Vowel_From_String {
	public static void main(String[] args) {
		String s = "It uses those low order bytes of the result that can fit into the size of the type allowed by the operation";
		
		String word[] = s.split("\\s");
		
		
		
		//String chnageWord = "null";
			
		for (int i = 0; i < word.length; i++) {

			String words = word[i];

			if (words.startsWith("low")) {

				word[i] = null;
			}
		}
		System.out.println(Arrays.toString(word));
	
	
	
	
	
	}

}
