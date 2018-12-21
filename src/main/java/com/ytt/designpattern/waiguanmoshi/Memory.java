package com.ytt.designpattern.waiguanmoshi;

import org.apache.log4j.Logger;

/**
 * Created by ytt on 2018/12/21.
 */
public class Memory {
    public static final Logger LOGGER = Logger.getLogger(Memory.class);

    public void start() {
        LOGGER.info("Memory is start...");
    }

    public void shutDown() {
        LOGGER.info("Memory is shutDown...");
    }
}
