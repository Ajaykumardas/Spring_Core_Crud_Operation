package com.qsp.spring_core_crud_operation.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.spring_core_crud_operation.MyConfig;
import com.qsp.spring_core_crud_operation.dto.Employee;
import com.qsp.spring_core_crud_operation.service.EmployeeService;

public class EmployeeUpdateController {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService employeeService=(EmployeeService) applicationContext.getBean("myService");
		
		Employee employee=(Employee) applicationContext.getBean("myEmployee");
		
		employee.setId(111);
		employee.setName("khushi");
		
		employeeService.updateEmployee(employee);
	}

}
