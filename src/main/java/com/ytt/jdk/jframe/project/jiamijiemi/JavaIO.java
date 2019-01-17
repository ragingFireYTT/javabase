package com.ytt.jdk.jframe.project.jiamijiemi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JavaIO {

    private File currentFile;
    public static void main(String[] args) throws Exception {
        JavaIO ja = new JavaIO();
        ja.findFiles("E:/");
        //      ja.readFile("E://类与对象总结.txt");
        //      ja.writeFile("这是写入文件的内容。","E://类与对象总结11.txt");
        //      ja.JiaMi("E://类与对象总结.txt", "D://加密后的类与对象总结.png");
        //      ja.JieMi("D://加密后的类与对象总结.png","E://解密后类与对象总结.txt" );
        //      ja.copy("E://类与对象总结.txt", "E://类与对象总结的复制文件.txt");
    }
    /**
     * 查找文件
     * @param s 查找目录
     */
    public void findFiles(String s){
        File file = new File(s);
        File[] f = file.listFiles();
        //      System.out.println(f);
        for(int i = 0;i<f.length;i++){
            currentFile = f[i];
            if(currentFile.isDirectory()){
                findFiles(currentFile.getAbsolutePath());
            }
            if(currentFile.getName().endsWith("txt"))
                System.out.println(currentFile);
        }
    }
    /**
     * 读取文件
     * @param s 文件名（带绝对路径）
     */
    public void readFile(String s){
        try {
            FileInputStream  fis = new FileInputStream(s);
            int n=fis.read();
            while(n!=-1){
                System.out.println("字节："+n);
                n = fis.read();
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 写文件的方法
     * @param msg 写入的内容
     * @param s 文件绝对路径
     * @throws Exception 抛出异常
     */
    public void writeFile(String msg,String s) throws Exception{
        try {
            FileOutputStream fos = new FileOutputStream(s,false);
            byte[] b = msg.getBytes();//得到组成字符串的字节
            fos.write(b);
            fos.close();//关闭输出流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 复制文件
     * @param from 原文件（带绝对路径）
     * @param to 复制后文件（带绝对路径）
     * @throws Exception
     */
    public void copy(String from,String to) throws Exception{
        FileInputStream  fis = new FileInputStream(from);
        FileOutputStream fos = new FileOutputStream(to,false);
        int n = fis.read();
        //循环写入
        while(n!=-1){
            fos.write(n);
            n=fis.read();
        }
        //关闭输入输出流
        fis.close();
        fos.close();
    }
    /**
     * 文件加密传输的方法
     * @param from 原文件（带绝对路径）
     * @param to 复 制后文件（带绝对路径）
     * @throws Exception 抛出异常
     */
    public void JiaMi(String from,String to,int day,int height) throws Exception{
        FileInputStream  fis = new FileInputStream(from);
        FileOutputStream fos = new FileOutputStream(to,false);
        int n = fis.read();
        int count=0;
        //循环写入
        while(n!=-1){//加密算法，可行定义，与解密算法相逆

            if(day%height*n != 1){
                fos.write(n+height);
            }else{
                fos.write(n);
            }
            n=fis.read();
        }
        fis.close();
        fos.close();
    }
    /**
     * 文件解密接收的方法
     * @param from 原文件（带绝对路径）
     * @param to 复制后文件（带绝对路径）
     * @throws Exception 抛出异常
     */
    public void JieMi(String from,String to,int day,int height) throws Exception{
        FileInputStream  fis = new FileInputStream(from);
        FileOutputStream fos = new FileOutputStream(to,false);
        int n = fis.read();
        //循环写入
        while(n!=-1){//解密算法，可行定义，与解密算法相逆
            if(day%height*n != 1){
                fos.write(n-height);
            }else{
                fos.write(n);
            }
            n=fis.read();
        }
        //关闭输入输出流
        fis.close();
        fos.close();
    }

}
