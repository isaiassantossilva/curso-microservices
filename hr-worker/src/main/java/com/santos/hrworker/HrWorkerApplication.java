package com.santos.hrworker;

import com.santos.hrworker.entities.Worker;
import com.santos.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrWorkerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HrWorkerApplication.class, args);
    }

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public void run(String... args) throws Exception {
        workerRepository.save(new Worker(1L, "Bob", 200.0));
        workerRepository.save(new Worker(2L, "Maria", 300.0));
        workerRepository.save(new Worker(3L, "Alex", 250.0));
    }
}
