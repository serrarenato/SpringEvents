package br.com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.event.model.Employee;
import br.com.event.model.event.CustomEvent;

@RestController
public class CreateUserController {
	@Autowired
	ApplicationContext applicationContext;
	
	@PostMapping("/")
	public Employee create(@RequestBody Employee newEmployee) {
		System.out.println("Insert Employee in Database:"+newEmployee);
		applicationContext.publishEvent(new CustomEvent(this, newEmployee.getName(), newEmployee.getEmail()));
		return newEmployee;
	}
}
