package io.zipcoder.crudapp.Service;

import io.zipcoder.crudapp.Entity.Person;
import io.zipcoder.crudapp.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {

        this.repository = repository;
    }

    public Iterable<Person> index() {
        return repository.findAll();
    }

    public Person show(Long id) {
        return (Person) repository.findById(id).get();
    }

    public Person create(Person p) {
        return repository.save(p);
    }

    public Person update(Long id, Person newPersonData) {
        Person originalPerson = (Person) repository.findById(id).get();
        originalPerson.setFirstName(newPersonData.getFirstName());
        return repository.save(originalPerson);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
}
