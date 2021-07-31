package com.santos.hrworker.resources;

import com.santos.hrworker.entities.Worker;
import com.santos.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public List<Worker> findAll(){
        return workerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Worker findById(@PathVariable long id){
        return workerRepository.findById(id).orElseThrow(() -> new RuntimeException("Worker not found"));
    }
}
