package org.example.jobpostgrecrud.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<PersonDTO, Long> {
    PersonDTO findPersonByName(String name);
    PersonDTO findPersonById(int id);
    boolean deletePersonById(int id);

    List<PersonDTO> findPersonDTOByProfession(String profession);
    List<PersonDTO> findPersonDTOBySector(String sector);

}
