package com.gupaoedu.vip.pattern.strategy.pay.payport;

import com.gupaoedu.vip.pattern.strategy.pay.Order;

public class PayStrategyTest {

    public static void main(String[] args) {

        //省略把商品添加到购物车，再从购物车下单
        Order order = new Order("1", "20180311001000009", 324.45);

        //支付开始，选择微信支付、支付宝、银联卡、京东白条、财付通
        //每个取到它支付的具体算法是不一样的
        //基本算法固定的
        System.out.println(order.pay(new AliPay()));
    }

}
