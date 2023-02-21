package com.qsp.spring_core_crud_operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qsp.spring_core_crud_operation.dao.EmployeeDao;
import com.qsp.spring_core_crud_operation.dto.Employee;

@Component(value = "myService")
public class EmployeeService {
	@Autowired
	EmployeeDao dao;

	// insert method
	public void insertEmployee(Employee employee) {
		dao.insertEmployee(employee);
	}

	// update method
	public void updateEmployee(Employee employee) {
		dao.updateEmployee(employee);
	}

	// display method
	public List<Employee> displayEmployee() {
		return dao.displayEmployee();
	}

	// delete method
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}

}
