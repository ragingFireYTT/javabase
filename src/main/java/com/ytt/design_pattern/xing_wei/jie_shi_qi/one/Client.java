package com.ytt.design_pattern.xing_wei.jie_shi_qi.one;

/**
 * Created by ytt on 2018/12/26.
 */
public class Client {
    public static void main(String[] args) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
