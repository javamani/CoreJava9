package com.towerplus.java8.dto;

public class Employee {
	
	String empName;
	
	String empSal;
	String empDept;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept + "]";
	}
}
