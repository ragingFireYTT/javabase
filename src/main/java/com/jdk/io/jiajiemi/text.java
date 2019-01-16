package com.jdk.io.jiajiemi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ytt on 2019/1/4.
 */
public class text {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("E://2.txt",false);
        fos.write(240+20); // 取低八位存储
        //fos.flush();
        //fos.write("sssddf".getBytes());
        fos.flush();
        fos.close();
        FileInputStream fis = new FileInputStream("E://2.txt");

        int length= fis.read();

        byte[] b= new byte[6];
        fis.read(b);

        System.out.println("-------------");

    }
}
