package com.hsz.springcloud.service;

import com.hsz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author created by hsz 2020/5/9 10:44
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
