package io.zipcoder.crudapp.Repository;

import io.zipcoder.crudapp.Entity.Person;
import org.springframework.data.repository.CrudRepository;




public interface PersonRepository extends CrudRepository<Person, Long> {


    void deleteById(Long id);

    ThreadLocal<Object> findById(Long id);
}
