package org.example.jobpostgrecrud.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
    private int id;
    private String name;
    private String surname;
    private Person profession;
    private Person sector;

    public PersonDTO(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
