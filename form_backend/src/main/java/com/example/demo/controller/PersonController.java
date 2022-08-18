package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/person")
public class PersonController {
private final PersonRepository person_repo;

	@Autowired
	public PersonController(PersonRepository person_repo){
		this.person_repo=person_repo;
	}
	@GetMapping
	public List<Person> listPersons(){
        return person_repo.findAll();
    }

    @GetMapping("{id}")
    public Person getSenderById(@PathVariable long id){
        Person sender=person_repo.findById(id)
        		.orElseThrow();
        return sender;
    }
    @PostMapping
    public Person AddCustomer(@RequestBody Person person){
        return person_repo.save(person);
        
    }
}
