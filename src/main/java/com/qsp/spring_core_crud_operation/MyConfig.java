package com.qsp.spring_core_crud_operation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value ="com.qsp.spring_core_crud_operation")
public class MyConfig {
	@Bean
	public EntityManagerFactory getEntityManagerFactory()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ajay");
		return entityManagerFactory;
	}

}
