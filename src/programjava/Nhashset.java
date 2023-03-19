package programjava;

import java.util.ArrayList;
import java.util.HashSet;

public class Nhashset {
	public static void main (String [] args) {
		// String list store
		
		HashSet<String> hashset1 = new HashSet<>();
		String str ="hello java world my name is nandini gadhwal";
		String word [] = str.split(str);
		/*for (int i = 0; i < word.length; i++) {
		hashset1.add(word[i]);
		}
		System.out.println(hashset1);*/
		//hashset1.forEach(s ->System.out.println(s+ " "));
		//hashset1.add(word[str]);
		//System.out.println(hashset1);
		
		// Java replace " poaton"
		
		/*for (int i = 0; i < hs.size(); i++) {
			String outWord = hs.get(i);
			if(outWord.equals("Java")) {
				hs.add(str);//add(i, "Payton");
				break;
			}*/
		hashset1.remove("name");
		System.out.println(hashset1);
		

	
	
	
	
	}

}
