package com.example.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " (" + department + "): " + salary;
	}
	
	public static void main(String[] args) {
	    List<Employee> employees = Arrays.asList(
	        new Employee(1, "Alice", "HR", 5000.0),
	        new Employee(2, "Bob", "IT", 7000.0),
	        new Employee(3, "Charlie", "Finance", 6000.0),
	        new Employee(4, "David", "HR", 4000.0),
	        new Employee(5, "Eve", "IT", 8000.0),
	        new Employee(6, "Frank", "Finance", 5500.0)
	    );

	    Map<String, Optional<Employee>> highestSalaryByDept = employees.stream()
	        .collect(Collectors.groupingBy(
	            Employee::getDepartment,
	            Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
	        ));

	    System.out.println("Highest paid employee per department:");
	    highestSalaryByDept.forEach((dept, empOpt) -> {
	        empOpt.ifPresent(emp -> System.out.println(dept + ": " + emp));
	    });

	    System.out.println();
	    double averageSalary = employees.stream()
	        .mapToDouble(Employee::getSalary)
	        .average()
	        .orElse(0.0);

	    System.out.printf("Average salary in the company: %.2f%n", averageSalary);

	    System.out.println();
	    List<String> aboveAverageEarners = employees.stream()
	        .filter(e -> e.getSalary() > averageSalary)
	        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
	        .map(Employee::getName)
	        .collect(Collectors.toList());

	    System.out.println("Employees earning above average salary (descending order):");
	    aboveAverageEarners.forEach(System.out::println);

	    System.out.println();
	    Map<String, List<Employee>> employeesByDept = employees.stream()
	        .collect(Collectors.groupingBy(Employee::getDepartment));

	    System.out.println("Employees grouped by department:");
	    employeesByDept.forEach((dept, emps) -> {
	        System.out.println(dept + ": " + emps);
	    });
	}

}
