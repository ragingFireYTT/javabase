package com.ytt.designpattern.waiguanmoshi;

import org.apache.log4j.Logger;

/**
 * Created by ytt on 2018/12/21.
 */
public class Computer {
    public static final Logger LOGGER = Logger.getLogger(Computer.class);

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        // 组合关系
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        LOGGER.info("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        LOGGER.info("Computer start end");
    }

    public void shutDown() {
        LOGGER.info("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        LOGGER.info("Computer shutDown end...");
    }

}
