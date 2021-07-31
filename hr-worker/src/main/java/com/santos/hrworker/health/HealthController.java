package com.santos.hrworker.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public Health health(){
        return new Health("UP");
    }

    private static final class Health {
        private final String status;

        public Health(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }
}
