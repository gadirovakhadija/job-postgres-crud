package org.example.jobpostgrecrud.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    private ResponseEntity<List<PersonDTO>> getPeople(
    ) {
        List<PersonDTO> p = personService.getAll();
        return ResponseEntity.ok(p);
    }

    @GetMapping("/{id}")
    private ResponseEntity<PersonDTO> getPerson(
            @PathVariable("id") int id
    ) {
        return ResponseEntity.ok(personService.findById(id));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deletePerson(
            @PathVariable("id") int id
    ) {
        return ResponseEntity.ok(personService.deletePersonById(id));
    }

    @GetMapping("/profession/")
    public ResponseEntity<List<PersonDTO>> getPeopleByProfession(@RequestParam String profession) {

        List<PersonDTO> personList = personService.findPersonByProfession(profession);
        return ResponseEntity.ok(personList);

    }

    @GetMapping("/sector/")
    public ResponseEntity<List<PersonDTO>> getPeopleBySector(@RequestParam String sector) {

        List<PersonDTO> personList = personService.findPersonBySector(sector);
        return ResponseEntity.ok(personList);

    }

    @PutMapping("/update")
    private ResponseEntity<PersonDTO> updatePerson(
            @RequestBody PersonDTO personDTO
    ) {
        return ResponseEntity.ok(personService.updatePerson(personDTO));
    }


    @PostMapping("/add")
    private ResponseEntity<PersonDTO> addPerson(
            @RequestBody PersonDTO personDTO
    ){
        return ResponseEntity.ok(personService.addPerson(personDTO));
    }
}
