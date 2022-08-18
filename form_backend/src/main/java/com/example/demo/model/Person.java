package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Person {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String firstname;
private String lastname;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
@Override
public String toString() {
	return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
}

}
