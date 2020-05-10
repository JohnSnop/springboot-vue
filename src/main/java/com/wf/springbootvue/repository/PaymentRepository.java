package com.wf.springbootvue.repository;

import com.wf.springbootvue.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wf
 * @create 2020-05-10 21:16
 * @desc
 **/
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
