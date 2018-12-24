package com.ytt.design_pattern.wai_guan_moshi;

import org.apache.log4j.Logger;

/**
 * Created by ytt on 2018/12/21.
 */
public class Cilent {
    public static final Logger LOGGER = Logger.getLogger(Cilent.class);

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        LOGGER.info("=================");
        computer.shutDown();
    }
}
