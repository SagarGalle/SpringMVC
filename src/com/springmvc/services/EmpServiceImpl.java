package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.EmpDao;
import com.springmvc.domain.Employee;

public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpDao empDao;

	@Override
	public int insertRow(Employee employee) {
		return empDao.insertRow(employee);
	}

	@Override
	public List<Employee> getList() {
		return empDao.getList();
	}

	@Override
	public Employee getRowById(int id) {
		return empDao.getRowById(id);
	}

	@Override
	public int updateRow(Employee employee) {
		return empDao.updateRow(employee);
	}

	@Override
	public int deleteRow(int id) {
		return empDao.deleteRow(id);
	}

}
