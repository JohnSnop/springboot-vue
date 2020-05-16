package com.wf.springbootvue.repository;

import com.wf.springbootvue.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author wf
 * @create 2020-05-10 21:16
 * @desc
 **/
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Optional<Payment> findById(Long id);

    // void deleteById(Long id);
}
