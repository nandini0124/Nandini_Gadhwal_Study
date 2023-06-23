package java8package;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest1 {
	public static List<Employee1> getEmployee() {
		List<Employee1> emplist = new ArrayList<Employee1>();
		emplist.add(new Employee1(1, "nandini", 20, "femail", "HR", 2018, 23000));
		emplist.add(new Employee1(2, "aarti", 20, "femail", "Sales", 2015, 30000));
		emplist.add(new Employee1(3, "abhay", 25, "mail", "Marketing", 2020, 20000));
		emplist.add(new Employee1(4, "abhishek", 23, "mail", "HR", 2022, 40000));
		emplist.add(new Employee1(5, "mayur", 26, "mail", "Marketing", 2023, 15000));

		return emplist;
	}

	public static void main(String[] args) {
		List<Employee1> list = EmployeeTest1.getEmployee();
		//List<String> list1 = list.stream().map(Employee1 :: getName).toList();
		//List<String> list2 = list.stream().map(e -> e.getName()).toList();
		List<Employee1>l = list.stream().filter(e -> e.getGender().equals("Male")).filter(e -> e.getSalary() > 20000).toList();

	
	
	}
}
