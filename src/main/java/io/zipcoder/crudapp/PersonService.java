package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

   @Autowired
   final PersonRepository personRepository;
    public PersonService(  PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person create(Person p) {
        return personRepository.save(p);
    }

    public Boolean delete(Long id) {
       personRepository.deleteById(id);
        return true;
    }

    public Person update(Person p) {
        return  null;
    }
}

