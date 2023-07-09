package org.example.jobpostgrecrud.person;

import jakarta.persistence.*;

import java.util.Objects;

public class Person {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "surname")
    private String surname;
    @JoinColumn(name="work_id",referencedColumnName = "id",nullable=false,
            updatable=false, insertable=false)
    @ManyToOne(fetch=FetchType.EAGER)
    private Person profession;
    @JoinColumn(name="work_id",referencedColumnName = "id",nullable=false,
            updatable=false, insertable=false)
    @ManyToOne(fetch=FetchType.EAGER)
    private Person sector;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person getProfession() {
        return profession;
    }

    public void setProfession(Person profession) {
        this.profession = profession;
    }

    public Person getSector() {
        return sector;
    }

    public void setSector(Person sector) {
        this.sector = sector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(profession, person.profession) && Objects.equals(sector, person.sector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, profession, sector);
    }
}
