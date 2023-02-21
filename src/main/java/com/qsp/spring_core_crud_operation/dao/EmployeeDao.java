package com.qsp.spring_core_crud_operation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qsp.spring_core_crud_operation.dto.Employee;
@Component
public class EmployeeDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	
	//insert method
	public void insertEmployee(Employee employee)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
			
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	//update method
	public void updateEmployee(Employee employee)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee2= entityManager.find(Employee.class, employee.getId());
		if(employee2!=null)
		{
			
			employee2.setName(employee.getName());
			entityTransaction.begin();
			entityManager.merge(employee2);
			entityTransaction.commit();
		}
		else
		System.out.println("id is not present");
		
	}
	//display method
	public List<Employee> displayEmployee()
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		String select="select e from Employee e";
	   return	 entityManager.createQuery(select).getResultList();
	}
	
	//delete method
	public void deleteEmployee(int id)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee= entityManager.find(Employee.class, id);
		if(employee!=null)
		{
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		else
			System.out.println("id is not present");
	}

}
