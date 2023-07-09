package org.example.jobpostgrecrud.work;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Work {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "profession")
    private String profession;
    @Basic
    @Column(name = "sector")
    private String sector;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Work work)) return false;
        return id == work.id && Objects.equals(profession, work.profession) && Objects.equals(sector, work.sector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, profession, sector);
    }
}
