package com.gupaoedu.vip.pattern.strategy.pay.payport;

import com.gupaoedu.vip.pattern.strategy.pay.PayState;

public interface Payment {

    //每次增加一个支付渠道，我们就要维护一次接口
    public final static Payment ALI_PAY = new AliPay();

    public PayState pay(String uid, double amount);

}
