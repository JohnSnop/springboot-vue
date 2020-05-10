package com.wf.springbootvue.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
}