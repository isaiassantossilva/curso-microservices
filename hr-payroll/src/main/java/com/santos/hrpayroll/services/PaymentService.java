package com.santos.hrpayroll.services;

import com.santos.hrpayroll.entities.Payment;
import com.santos.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    private String workerHost;

    public Payment getPayment(long workerId, int days){
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", Long.toString(workerId));

        var worker = restTemplate
                .getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
