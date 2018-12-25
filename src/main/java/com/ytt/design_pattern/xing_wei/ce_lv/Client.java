package com.ytt.design_pattern.xing_wei.ce_lv;

/**
 * Created by ytt on 2018/12/25.
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(100);
        movieTicket.setDiscount(new VIPDiscount());
        System.out.println(movieTicket.getPrice());
    }
}
