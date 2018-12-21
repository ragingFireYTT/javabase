package com.ytt.designpattern.waiguanmoshi;

import org.apache.log4j.Logger;

/**
 * Created by ytt on 2018/12/21.
 */
public class CPU {
    public static final Logger LOGGER = Logger.getLogger(CPU.class);

    public void start() {
        LOGGER.info("cpu is start ....");
    }

    public void shutDown() {
        LOGGER.info("cpu is shutDown ...");
    }
}
