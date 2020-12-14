package com.assignment7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101, "Shayan", "Agartala", 39000));
		emp.add(new Employee(102, "Diptanu", "Dhaleswar", 30000));
		emp.add(new Employee(103, "Robin", "Indranagar", 25000));
		
		int empId = 101;
		String empName = "Shayan";
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getEmpId()==empId && emp.get(i).getEmpName().toLowerCase().equals(empName.toLowerCase())) {
				System.out.println("ID : "+emp.get(i).getEmpId() + 
									"\n"+"Name : "+emp.get(i).getEmpName() +
									"\n"+"Address : "+emp.get(i).getEmpAddress()+
									"\n"+"Salary : "+emp.get(i).getEmpSalary());
				System.exit(1);
			}
		}
		System.out.println("Employee doesn't exist");
	}

}