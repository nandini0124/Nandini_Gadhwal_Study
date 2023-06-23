package java8package;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Integer {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		//filter condition 
		//list=list.stream().filter(e -> e%2==0).collect(Collectors.toList());
		//System.out.println(list);
		
		//modifie in data
		
		list=list.stream().map(e ->e+1).toList();
		System.out.println(list);
		


		

	}

}
