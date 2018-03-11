package com.gupaoedu.vip.pattern.strategy.pay.payport;

import com.gupaoedu.vip.pattern.strategy.pay.PayState;

public class AliPay implements Payment {

    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200, "支付成功", amount);
    }

}
