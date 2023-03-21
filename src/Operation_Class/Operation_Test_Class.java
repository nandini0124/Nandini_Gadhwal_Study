package Operation_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Operation_Test_Class implements Method_Interface{

	@Override
	public void print() {
		String str="hello java world";
		System.out.println(str);
	}

	@Override
	public void listprint() {
		ArrayList<String> list1 = new ArrayList<>();
		String s = "this is a arraylist";
		String word[] = s.split("\\s");
           for (int i = 0; i < word.length; i++) {
			list1.add(word[i]);
		}
		System.out.println(list1);
		
		
	}

	@Override
	public void setprint() {
		ArrayList<String> list2 = new ArrayList<>();
		HashSet<String> hs = new HashSet<>();
		hs.add("abhay");
		hs.add("nandini");
		hs.add("abhay");
		hs.add("abhishek");
		hs.addAll(list2);
				
		System.out.println(hs);
		
	}

	@Override
	public void hashmap() {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"aarti");
		map.put(null, null);
		map.put(2, "abhi");
    System.out.println(map);		
	}

	@Override
	public void array() {
		//int arr = {1,2,3,4,5};
		System.out.println("array");
		
	
	
}
}
