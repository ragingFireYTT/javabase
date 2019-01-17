package com.ytt;

import org.junit.Test;

import java.io.File;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by ytt on 2018/12/20.
 */
public class temp {
    public static void main(String[] args) {


        String path="E:\\Cache\\迅雷\\中国通史" +
                "\\【蚂蚁仔www.mayizai.com】" +
                "[CCTV6纪录片.中国通史][全100集][HDTV-TS-340GB][国语中文][1080i][无水印]";
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int j = 0; j < files.length; j++) {
                File file1 = files[j];
                String replace = file1.getName().substring(1);
                file1.renameTo(new File(path+"\\"+replace));
            }
        }

    }
    @Test
    public void test(){
        String s = "1";
        String s2 = "2";
        s.compareTo(s2);

    }
}
