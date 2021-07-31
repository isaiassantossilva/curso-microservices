package com.santos.hrpayroll.services;

import com.santos.hrpayroll.entities.Payment;
import com.santos.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){
        var worker = workerFeignClient.findById(workerId);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
