package com.assignment7;

public class Employee {
	private int EmpId; 
	private String EmpName;
	private String EmpAddress; 
	private float EmpSalary;
	
	public Employee() {}

	public Employee(int empId, String empName, String empAddress, float empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAddress = empAddress;
		EmpSalary = empSalary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpAddress() {
		return EmpAddress;
	}

	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	
	public float getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(float empSalary) {
		EmpSalary = empSalary;
	}
	
	
}