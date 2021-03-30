package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao persondao;

	public List<Person> findByLastName(String lastName) {
		return persondao.findByLastName(lastName);
	}

	public Iterable<Person> SavePersonData(List<Person> Personlist) {
		return persondao.saveAll(Personlist);
	}

	public Iterable<Person> FirstNameorLastName(String firstname, String lastname) {
		return persondao.findByFirstNameOrLastName(firstname, lastname);
	}

}
