package org.example.jobpostgrecrud.work;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<WorkDTO, Long> {
    WorkDTO findWorkDTOById(int id);
    boolean deleteWorkDTOById(int id);
}
