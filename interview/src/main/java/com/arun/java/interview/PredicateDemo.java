package com.arun.java.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Emp emp1 = new Emp(101, "Arun1", 1000000, "Bangalore", 10.00, "IT", "8989898989");
		Emp emp2 = new Emp(102, "Arun2", 2000000, "Hyderabad", 11.00, "IT2", "121212121212");
		Emp emp3 = new Emp(103, "Arun3", 3000000, "Delhi", 20.00, "HR", "121212121212");
		Emp emp4 = new Emp(104, "Arun4", 4000000, "Mumbai", 9.00, "GM", "3434343434");
		Emp emp5 = new Emp(105, "Arun5", 5000000, "Delhi", 5.00, "CTO", "6767676767");
		Emp emp6 = new Emp(101, "Arun1", 1000000, "Bangalore", 10.00, "IT", "8989898989");
		Emp emp7 = new Emp(102, "Arun2", 2000000, "Hyderabad", 11.00, "IT2", "121212121212");
		Emp emp8 = new Emp(103, "Arun3", 3000000, "Delhi", 20.00, "HR", "121212121212");
		Emp emp9 = new Emp(104, "Arun4", 4000000, "Mumbai", 9.00, "GM", "3434343434");
		Emp emp10 = new Emp(105, "Arun5", 5000000, "Delhi", 5.00, "CTO", "6767676767");

		List<Emp> empList = new ArrayList<Emp>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		String cityVar = "Delhi";
		Predicate<Emp> city = e -> e.getCity().equalsIgnoreCase(cityVar);
		Predicate<Emp> iTdept = e -> e.getDept().contains("IT");
		Predicate<Emp> srEmp = e -> e.getExperience() >= 10;
		Predicate<Emp> salary = e -> e.getSal() >= 3000000;

		for (Emp e : empList) {
			// find all people above 30000 and belogs to Delhi
//			if (salary.and(city).test(e)) {
//				System.out.println(e.getSal() + " " + e.getCity()+ " " + e.getName());
//			}
			// find all people less 30000 or do not belongs to Delhi
			if (salary.negate().or(city.negate()).test(e)) {
//				System.out.println(e.getSal() + " " + e.getCity()+ " " + e.getName());
			}
			// find all people less 30000 and do not belongs to Delhi
			if (salary.negate().and(city.negate()).test(e)) {
				System.out.println(e.getSal() + " " + e.getCity()+ " " + e.getName());
			}
		}
	}
}