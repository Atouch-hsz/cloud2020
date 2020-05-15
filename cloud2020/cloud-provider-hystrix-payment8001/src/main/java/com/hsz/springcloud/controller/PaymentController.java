package com.hsz.springcloud.controller;

import com.hsz.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author created by hsz 2020/5/15 16:28
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok")
    public String paymentInfo_OK()
    {
        String result = paymentService.paymentInfo_OK();
        return result;
    }

    @GetMapping("/payment/hystrix/timeout")
    public String paymentInfo_Timeout()
    {
        String result = paymentService.paymentInfo_Timeout();
        return result;
    }
}
