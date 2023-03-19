package programjava;
import java.util.ArrayList;
import java.util.Arrays;



public class Arraylistn {
	public static void main(String[] args) {
			
		String str = "The Collection in Java is a framework c provides an architecture to store and manipulate the group of objects.";
		
		ArrayList <String> list = new ArrayList<>();	
		
		String word[] = str.split("\\s");     //string print without
		
		//for (int i = 0; i < word.length; i++) {
			//list.add(word[i]);
		
		System.out.println(list);
		list.add(3, "paython");
	//}

		
		//System.out.println(list.replaceAll(null)));    //java replace paython
		
		System.out.println(word[word.length - 1]);
		String firstword = word[0];
		String lastword = word[word.length - 1];
		word[0] = lastword;
		word[word.length - 1] = firstword;
		//System.out.println(Arrays.toString(word));*/
		

}
}
