package java8package;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8String {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("nandini");
		list.add("nilima");
		list.add("nikita");
		list.add("lavisha");
		list.add("vaishanvi");
		list.add("mahi");
		list.add("kumkum");
		
		//filter Condition
		//list=list.stream().filter(s -> s.startsWith("n")).collect(Collectors.toList());
		//System.out.println(list);
		
		//modife condition
		
		list=list.stream().map(e ->"Miss ".concat(e)).toList();
		System.out.println(list);
	}

}
