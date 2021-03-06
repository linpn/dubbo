/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alibaba.dubbo.common;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * BASE Model.
 *
 * @author Linpn
 * @since 04.11.2015
 */
public class Model implements Serializable {

    private static final long serialVersionUID = 5046534737074452170L;

    /**
     * 重新默认的toString()，用于输出日志等
     * 注：对于有敏感字段的类，请对重写改实现，否则敏感信息也会被输出
     *
     * @see Object#toString()
     */
    public String toString() {
        try {
            return JSON.toJSONString(this);
        } catch (Exception e) {
            return super.toString();
        }
    }
}
