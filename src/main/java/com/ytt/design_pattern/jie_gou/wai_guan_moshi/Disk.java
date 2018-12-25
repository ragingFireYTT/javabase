package com.ytt.design_pattern.jie_gou.wai_guan_moshi;

import org.apache.log4j.Logger;

/**
 * Created by ytt on 2018/12/21.
 */
public class Disk {
    public static final Logger LOGGER = Logger.getLogger(Disk.class);

    public void start() {
        LOGGER.info("Disk is start...");
    }

    public void shutDown() {
        LOGGER.info("Disk is shutDown...");
    }
}
