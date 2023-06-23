package DataOfStudents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String []args) {
		Students s1 = new Students();
		s1.setIntId(1);
		s1.setCharV('n');
		s1.setFloatV(30f);
		s1.setDabl(20.8);
		s1.setNameString("nandini");
		
		String s[] = new String[10];
		s[1] = "hello";
		s[2] = "hay";
		s1.setNameArray(s);
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("python");
		s1.setList(list);
		
		Set<String> set = new HashSet<>();
		set.add("paython is the best language");
		set.add("java is the most important language");
		s1.setSet(set);
		
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "Java");
		map.put("2", "Daru");
		s1.setMap(map);
		
		StudentInterface ref = new StudentOperation();
		
		
		
		}

}
