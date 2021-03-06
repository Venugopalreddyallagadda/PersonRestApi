package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name ="person_table")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="person_id")
	private int id;
	
	@Column(name ="first_name", nullable = false)
	private String firstName;
	
	@Column(name ="last_name" )
	private String lastName;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="creation_date")
	private String creationDate;
	
	@Column(name ="age")
	private int age;
	

	public Person(String firstName, String lastName, String email, int age, String creationDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + ", age=" + age + "]";
	}
	
	
}
