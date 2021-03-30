package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

public interface PersonDao extends JpaRepository<Person,Integer> {
		List<Person> findByLastName(String lastName);
		
		List<Person>findByFirstNameOrLastName(String firstName, String lastName);
}
