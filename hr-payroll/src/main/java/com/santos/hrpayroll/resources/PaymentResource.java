package com.santos.hrpayroll.resources;

import com.santos.hrpayroll.entities.Payment;
import com.santos.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{workerId}/days/{days}")
    public Payment getPayment(@PathVariable long workerId, @PathVariable int days){
        return paymentService.getPayment(workerId, days);
    }
}
