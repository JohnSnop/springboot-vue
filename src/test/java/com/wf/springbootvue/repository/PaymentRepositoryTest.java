package com.wf.springbootvue.repository;

import com.wf.springbootvue.domain.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author wf
 * @create 2020-05-10 21:18
 * @desc
 **/
@SpringBootTest
class PaymentRepositoryTest {
    @Autowired
    private PaymentRepository paymentRepository;

    @Test
    void findAll() {
        System.out.println(paymentRepository.findAll());
    }

    @Test
    void save() {
        Payment payment = new Payment();
        payment.setSerial("Springboot+vue");
        paymentRepository.save(payment);
    }
}