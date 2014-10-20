package com.springmvc.dao;

import java.util.List;

import com.springmvc.domain.Employee;

public interface EmpDao {
	public int insertRow(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int updateRow(Employee employee);

	public int deleteRow(int id);

}
