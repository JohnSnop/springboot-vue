package com.wf.springbootvue.controller;

import com.wf.springbootvue.domain.CommonResult;
import com.wf.springbootvue.domain.Payment;
import com.wf.springbootvue.repository.PaymentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wf
 * @create 2020-05-10 21:26
 * @desc
 **/
@RestController
public class PaymentController {
    @Resource
    private PaymentRepository paymentRepository;

    @RequestMapping("/payment/findAll")
    public CommonResult<List<Payment>> findAll() {
        List<Payment> paymentList = paymentRepository.findAll();
        return new CommonResult<>(200, "查询成功", paymentList);
    }

    @RequestMapping("/payment/findByPage/{page}/{size}")
    public CommonResult<Page<Payment>> findByPage(@PathVariable Integer page, @PathVariable Integer size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        Page<Payment> paymentList = paymentRepository.findAll(pageable);
        return new CommonResult<>(200, "查询成功", paymentList);
    }

    @PostMapping("/payment/save")
    public CommonResult<Payment> save(@RequestBody Payment payment) {
        Payment save = paymentRepository.save(payment);
        return new CommonResult<>(200, "添加成功", save);
    }
}
