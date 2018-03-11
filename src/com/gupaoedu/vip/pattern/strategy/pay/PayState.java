package com.gupaoedu.vip.pattern.strategy.pay;

/**
 * 支付完成以后的状态
 */
public class PayState {

    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString() {
        return ("支付状态：[" + code + "]，支付成功，交易详情：" + data);
    }
}
