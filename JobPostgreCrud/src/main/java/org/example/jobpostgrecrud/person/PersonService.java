package org.example.jobpostgrecrud.person;

import java.util.List;

public interface PersonService {
    List<PersonDTO> getAll();

    PersonDTO findByName(String name);

    PersonDTO findById(int id);

    int findIdByName(String name);

    PersonDTO updatePerson(PersonDTO p);

    boolean deletePersonById(int id);

    PersonDTO addPerson(PersonDTO p);

    List<PersonDTO> findPersonByProfession(String profession);
    List<PersonDTO> findPersonBySector(String sector);
}
