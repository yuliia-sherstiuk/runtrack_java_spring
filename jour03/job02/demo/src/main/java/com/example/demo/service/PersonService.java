package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    // Injection du repository via constructeur
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Méthode pour récupérer toutes les personnes
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // Méthode pour ajouter une personne
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    // Autres méthodes métier...
}
2️⃣