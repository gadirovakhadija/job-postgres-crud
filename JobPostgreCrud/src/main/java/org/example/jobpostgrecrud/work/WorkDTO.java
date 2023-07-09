package org.example.jobpostgrecrud.work;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkDTO {
    private int id;
    private String profession;
    private String sector;
}
