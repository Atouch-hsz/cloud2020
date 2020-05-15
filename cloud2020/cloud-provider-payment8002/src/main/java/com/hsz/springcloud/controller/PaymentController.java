package com.hsz.springcloud.controller;

import com.hsz.springcloud.entities.CommonResult;
import com.hsz.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author created by hsz 2020/5/12 11:30
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return new CommonResult(200, "插入数据库成功: ");
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return new CommonResult(200, "查询成功 ,serverPort: " + serverPort);
    }
}
