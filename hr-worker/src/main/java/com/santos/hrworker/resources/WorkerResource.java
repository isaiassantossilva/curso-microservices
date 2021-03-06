package com.santos.hrworker.resources;

import com.santos.hrworker.entities.Worker;
import com.santos.hrworker.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired
    private Environment environment;

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public List<Worker> findAll(){
        return workerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Worker findById(@PathVariable long id){
        logger.info("POST = " + environment.getProperty("local.server.port"));
        return workerRepository.findById(id).orElseThrow(() -> new RuntimeException("Worker not found"));
    }
}
