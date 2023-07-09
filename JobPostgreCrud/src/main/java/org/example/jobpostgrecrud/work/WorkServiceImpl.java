package org.example.jobpostgrecrud.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    WorkRepository workRepo;

    @Override
    public List<WorkDTO> getAll() {
        return workRepo.findAll();
    }

    @Override
    public WorkDTO updateWork(WorkDTO w) {
        WorkDTO per = workRepo.findWorkDTOById(w.getId());

        per.setProfession(w.getProfession());
        per.setSector(w.getSector());

        return workRepo.save(per);
    }

    @Override
    public boolean deleteWorkById(int id) {
        return workRepo.deleteWorkDTOById(id);
    }

    @Override
    public WorkDTO addWork(WorkDTO w) {
        return workRepo.save(w);
    }
}
