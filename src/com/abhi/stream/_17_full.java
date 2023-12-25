package com.abhi.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _17_full {
	
	int id;
	String name;
	int age;
	String gender;
	String deppartment;
	int yearOfJoining;
	double salary;
	public _17_full(int id, String name, int age, String gender, String deppartment, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deppartment = deppartment;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDeppartment() {
		return deppartment;
	}
	public void setDeppartment(String deppartment) {
		this.deppartment = deppartment;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "_17_full [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deppartment="
				+ deppartment + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		
		List<_17_full> employeeList = new ArrayList<_17_full>();
		 
		employeeList.add(new _17_full(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new _17_full(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new _17_full(3, "David", 29, "Male", "Infrastructure", 2012, 
		18000.0));
		employeeList.add(new _17_full(4, "Orlen", 28, "Male", "Development", 2014, 
		32500.0));
		employeeList.add(new _17_full(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new _17_full(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new _17_full(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new _17_full(8, "Suresh", 31, "Male", "Development", 2015, 
		34500.0));
		employeeList.add(new _17_full(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new _17_full(10, "Mahesh", 38, "Male", "Security", 2015, 
		11000.5));
		employeeList.add(new _17_full(11, "Gouri", 27, "Female", "Infrastructure", 2014, 
		15700.0));
		employeeList.add(new _17_full(12, "Nithin", 25, "Male", "Development", 2016, 
		28200.0));
		employeeList.add(new _17_full(13, "Swathi", 27, "Female", "Finance", 2013, 
		21300.0));
		employeeList.add(new _17_full(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new _17_full(15, "Ashok", 23, "Male", "Infrastructure", 2018, 
		12700.0));
		employeeList.add(new _17_full(16, "Sanvi", 26, "Female", "Development", 2015, 
		28900.0));

		System.out.println("1=========================");
		//1. How many male and female employees are there in the organization ?
		Map<String, Long> map1 = employeeList.stream().collect(Collectors.groupingBy(_17_full::getGender,Collectors.counting()));
		System.out.println(map1);
		
		System.out.println("2=========================");
		// 2. Print the name of all departments in the organization ?
		employeeList.stream().map(_17_full :: getDeppartment ).distinct().forEach(n->System.out.println(n));
		
		System.out.println("3=========================");
		// 3. What is the average age of male and female employees ?
		Map<String, Double> avg = employeeList.stream().collect(Collectors.groupingBy(_17_full :: getGender,Collectors.averagingInt(_17_full :: getAge)));
		System.out.println(avg);
		
		System.out.println("4=========================");
		//4. Get the details of highest paid employee in the organization ?
		
		Optional<_17_full> collect = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(_17_full :: getSalary)));
		 if(collect.isPresent()) {
			 _17_full full = collect.get();
			 System.out.println(full.name);
		 }
		 
		 System.out.println("5=========================");
		 //5. Get the names of all employees who have joined after 2015 ?

		 employeeList.stream().filter(n->n.yearOfJoining>2015).map(n->n.getName() +" : :"+n.getYearOfJoining()).forEach(n->System.out.println(n));
		 
		 System.out.println("6=========================");
		 //6. Count the number of employees in each department ?
		 Map<String, Long> dept = employeeList.stream().collect(Collectors.groupingBy(_17_full::getDeppartment,Collectors.counting()));
		 System.out.println(dept);
		
		 System.out.println("7=========================");
		 //7. What is the average salary of each department ?
		 
		 Map<String, Double> avg1 = employeeList.stream().collect(Collectors.groupingBy(_17_full::getDeppartment ,Collectors.averagingDouble(_17_full::getSalary)));
		 System.out.println(avg1);
		 
		 System.out.println("8=========================");
		 //8. Get the details of youngest male employee in the Development department ?
		 
		 Optional<_17_full> min = employeeList.stream().filter(n->n.getGender().equals("Male") && n.getDeppartment().equals("Development")).min(Comparator.comparing(_17_full :: getAge));
		 
		 if(min.isPresent()) {
			 
			 System.out.println( min.get());
		 }
		 
		 System.out.println("9=========================");
		 //9. Who has the most working experience in the organization ?
		 
		 Optional<_17_full> collect2 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(_17_full::getYearOfJoining)));
		 if(collect2.isPresent()) {
			 System.out.println(collect2.get());
		 }
		 System.out.println("10=========================");
		 //10. How many male and female employees are there in the Sales team ?

		 Map<String,Long> collect3 = employeeList.stream().filter(n->n.getDeppartment().equals("Sales")).collect(Collectors.groupingBy(_17_full :: getGender,Collectors.counting()));
		 System.out.println(collect3);
		 
		 System.out.println("11=========================");
		 //11. What is the average salary of male and female employees ?
		 
		 Map<String,Double> collect4 = employeeList.stream().collect(Collectors.groupingBy(_17_full :: getGender,Collectors.averagingDouble(_17_full :: getSalary)));
		 System.out.println(collect4);
		 
		 System.out.println("12=========================");
		 //12. List down the names of all employees in each department ?
		 
		 Map<String,List<String>> collect5 = employeeList.stream().collect(Collectors.groupingBy(_17_full :: getDeppartment,Collectors.mapping(_17_full :: getName,Collectors.toList())));
		 System.out.println(collect5);
		 
		 System.out.println("13=========================");
		 //13. What is the average salary and total salary of the whole organization ?
		 OptionalDouble average = employeeList.stream().mapToDouble(_17_full :: getSalary).average();
		 System.out.println(average);
		 
		 double sum = employeeList.stream().mapToDouble(_17_full :: getSalary).sum();
		 System.out.println(sum);
		 
		 System.out.println("14=========================");
		
		 Stream<String> map = employeeList.stream().filter(n->n.getAge()<=25).map(n->n.name);
		 System.out.println(map);
		 

		 
		 System.out.println("15=========================");
		 //14. Separate the employees who are younger or equal to 25 years from those 
		 //employees who are older than 25 years ?
		 Set<Entry<Boolean, List<_17_full>>> entrySet = employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25)).entrySet();
		 System.out.println("---------------");

		 for(Entry<Boolean, List<_17_full>> entry:entrySet) {
		 	if(entry.getKey()) {
		 		System.out.println("Emp older of age 25 ");
		 	}else {
		 		System.out.println("Emp younger"
		 				+ " of age 25 ");
		 	}
		 	System.out.println("---------------");

		 	List<_17_full> list = entry.getValue();
		 	for(_17_full e:list) {
		 		System.out.println(e.getName());	
		 }
		 }
		 
		 System.out.println("16=========================");
		 
		 
		// Print names of employees in each department
//		 for (Map.Entry<String, List<String>> entry : namesEmp.entrySet()) {
//		     String department = entry.getKey();
//		     List<String> employeeNames = entry.getValue();
//
//		     System.out.println("Department: " + department);
//		     System.out.println("Employees: " + employeeNames);
//		     System.out.println();
//		 }
		
		 System.out.println("17================================");

		 //emp name whose are >=30 and emp<=40
		 Stream<String> map2 = employeeList.stream().filter(e->e.age>30&&e.age<40).map(e->e.getName());
		map2.forEach(name->System.out.println(name));
		
		
		System.out.println("18================================");

		//younger <=25
	   List<_17_full> collect6 = employeeList.stream().filter(e->e.getAge()<=25).collect(Collectors.toList());
		for(_17_full e:collect6) {
			System.out.println(e.getName());
		}
		
		//older >30
		List<_17_full> collect7 = employeeList.stream().filter(e->e.getAge()>30).collect(Collectors.toList());
		for(_17_full e:collect7) {
			System.out.println("Older-----------"+e.getName());
		}
		System.out.println("19================================");

		//one old emp i.e max age
		 Optional<_17_full> collect8 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(_17_full::getAge)));
		if(collect8.isPresent()) {
			System.out.println(collect8.get().name);
		}
		System.out.println("20================================");

		//if 2 emp are old with same age

		System.out.println("21=========================");
		// Find the oldest employee(s) with the maximum age
		Optional<_17_full> max11 = employeeList.stream()
		        .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

		System.out.println("22=========================");
		// Print the oldest employee(s)
		if (max11.isPresent()) {
		     _17_full sall = max11.get();
		    System.out.println("Oldest employee(s) (age " + sall.getAge() + "):");
		    employeeList.stream()
		            .filter(e -> e.getAge() == sall.getAge())
		            .forEach(e -> System.out.println(e.getName()));
		}	
		
	}	
}
