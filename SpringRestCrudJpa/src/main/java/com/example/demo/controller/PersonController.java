package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/data")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@PostMapping("/addPersons")
	private Iterable<Person> createPersons(@RequestBody List<Person> PersonList){
		Iterable<Person> list = service.SavePersonData(PersonList);
		return list;
	}
	@GetMapping("person/{lastName}")
	private List<Person>findByLastName(@PathVariable("lastname")String lastname) {
		List<Person>personlist = service.findByLastName("lastName");
		return personlist;
	}
	@GetMapping("person/{firstName}{lastName}")
	private Iterable<Person> findByFirstNameorLastName(@PathVariable("firstName")String firstName,@PathVariable("lastname")String lastname) {
		Iterable<Person>personlist = service.FirstNameorLastName("firstName","lastName");
		return personlist;
	}
	
}
