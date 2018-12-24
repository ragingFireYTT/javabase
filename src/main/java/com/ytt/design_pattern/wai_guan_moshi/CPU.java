package com.ytt.design_pattern.wai_guan_moshi;

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
