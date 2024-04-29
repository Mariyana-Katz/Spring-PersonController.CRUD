package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Person")
public class PersonController {

   @Autowired
   final PersonService service;

    @Autowired
    PersonController(PersonService service){
        this.service = service;
    }
    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person p) {
        return new ResponseEntity<>(service.create(p), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public Person getPerson(@PathVariable Long id){
        return null;
   }

   @GetMapping("/get") public List<Person> getPersonList(){
        return null;

   }

   @PutMapping("/update")
   public Person updatePerson(@RequestBody Person p){
        return null;
   }
    public ResponseEntity<Person> update( @RequestBody Person p) {
        return new ResponseEntity<>(service.update(p), HttpStatus.OK);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
