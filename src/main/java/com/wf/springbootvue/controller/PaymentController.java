package com.wf.springbootvue.controller;

import com.wf.springbootvue.domain.CommonResult;
import com.wf.springbootvue.domain.Payment;
import com.wf.springbootvue.repository.PaymentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
