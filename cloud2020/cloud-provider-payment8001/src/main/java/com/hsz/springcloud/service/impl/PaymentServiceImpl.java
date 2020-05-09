package com.hsz.springcloud.service.impl;

import com.hsz.springcloud.dao.PaymentDao;
import com.hsz.springcloud.entities.Payment;
import com.hsz.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author created by hsz 2020/5/9 10:45
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
