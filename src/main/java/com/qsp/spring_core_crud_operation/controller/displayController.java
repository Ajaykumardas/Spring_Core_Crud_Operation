package com.qsp.spring_core_crud_operation.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.spring_core_crud_operation.MyConfig;
import com.qsp.spring_core_crud_operation.dto.Employee;
import com.qsp.spring_core_crud_operation.service.EmployeeService;

public class displayController {
	public static void main(String[] args) {
		
	
	ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	EmployeeService employeeService=(EmployeeService) applicationContext.getBean("myService");
	
	Employee employee=(Employee) applicationContext.getBean("myEmployee");
	List<Employee> employees=employeeService.displayEmployee();
	for(Employee emp : employees )
	{
		System.out.println(emp);
	}

	}
}
