package org.example.jobpostgrecrud.work;


import java.util.List;

public interface WorkService {

    List<WorkDTO> getAll();
    WorkDTO updateWork(WorkDTO w);

    boolean deleteWorkById(int id);

    WorkDTO addWork(WorkDTO w);
}
