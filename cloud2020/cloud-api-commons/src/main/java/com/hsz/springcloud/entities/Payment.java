package com.hsz.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author created by hsz 2020/5/9 10:24
 */
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
