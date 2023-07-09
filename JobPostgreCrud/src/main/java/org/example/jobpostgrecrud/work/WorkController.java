package org.example.jobpostgrecrud.work;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work")
public class WorkController {

    @Autowired
    WorkService workService;

    @GetMapping
    private ResponseEntity<List<WorkDTO>> getWorks(
    ) {
        List<WorkDTO> w = workService.getAll();
        return ResponseEntity.ok(w);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deleteWork(
            @PathVariable("id") int id
    ) {
        return ResponseEntity.ok(workService.deleteWorkById(id));
    }

    @PutMapping("/update")
    private ResponseEntity<WorkDTO> updateWork(
            @RequestBody WorkDTO workDTO
    ) {
        return ResponseEntity.ok(workService.updateWork(workDTO));
    }


    @PostMapping("/add")
    private ResponseEntity<WorkDTO> addWork(
            @RequestBody WorkDTO workDTO
    ){
        return ResponseEntity.ok(workService.addWork(workDTO));
    }
}
