package org.example.jobpostgrecrud.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    PersonRepository personRepo;

    @Override
    public List<PersonDTO> getAll() {
        return personRepo.findAll();
    }

    @Override
    public PersonDTO findByName(String name) {
        return personRepo.findPersonByName(name);
    }

    @Override
    public PersonDTO findById(int id) {
        return personRepo.findPersonById(id);
    }

    @Override
    public int findIdByName(String name) {
        return personRepo.findPersonByName(name).getId();
    }

    @Override
    public PersonDTO updatePerson(PersonDTO p) {
        PersonDTO per = personRepo.findPersonById(p.getId());

        per.setName(p.getName());
        per.setSurname(p.getSurname());
        per.setProfession(p.getProfession());
        per.setSector(p.getSector());

        return personRepo.save(per);
    }

    @Override
    public boolean deletePersonById(int id) {
        return personRepo.deletePersonById(id);
    }

    @Override
    public PersonDTO addPerson(PersonDTO p) {
        return personRepo.save(p);
    }

    @Override
    public List<PersonDTO> findPersonByProfession(String profession) {
        return personRepo.findPersonDTOByProfession(profession);
    }

    @Override
    public List<PersonDTO> findPersonBySector(String sector) {
        return personRepo.findPersonDTOBySector(sector);
    }
}
