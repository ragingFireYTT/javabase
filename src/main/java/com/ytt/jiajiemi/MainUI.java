package com.ytt.jiajiemi;

/**
 * Created by ytt on 2019/1/4.
 */


import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainUI extends JFrame {

    public static void main(String[] args) {
        MainUI mu = new MainUI();
        mu.init();
    }

    /**
     * 初始化界面的方法
     */
    private void init() {
        this.setTitle("文件处理");
        this.setSize(395, 850);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        //addBackground();
        JLabel j1 = new JLabel("    文件名 ：        ");
        JTextArea jp1 = new JTextArea(2, 30);
        jp1.setText("测试用文件.txt");

        JLabel j2 = new JLabel("文件绝对路径：");
        JTextArea jp2 = new JTextArea(2, 30);
        jp2.setText("E://");

        JLabel j3 = new JLabel("     内容  ：          ");
        JTextArea jp3 = new JTextArea(5, 30);
        jp3.setText("这是测试文件的具体内容。");

        this.add(j1);
        this.add(jp1);
        this.add(j2);
        this.add(jp2);
        this.add(j3);
        this.add(jp3);

        JButton jb_write = new JButton("写入文件");
        jb_write.setBorderPainted(false);
        jb_write.setFocusable(false);
        this.add(jb_write);

        JButton jb_read = new JButton("读取文件");
        jb_read.setBorderPainted(false);
        jb_read.setFocusable(false);
        this.add(jb_read);

        JLabel j4 = new JLabel("（必须已有该文件）");
        this.add(j4);


        JLabel jfore = new JLabel("  文件原地址  ：");
        JTextArea jtfore = new JTextArea(2, 30);
        jtfore.setText("E://测试用文件.txt");
        this.add(jfore);
        this.add(jtfore);

        JLabel jafter = new JLabel("文件目标地址：");
        JTextArea jtafter = new JTextArea(2, 30);
        jtafter.setText("D://复制过来的测试用文件.txt");
        this.add(jafter);
        this.add(jtafter);

        JButton jb_copy = new JButton("  复  制            文  件  ");
        jb_copy.setBorderPainted(false);
        jb_copy.setFocusable(false);
        this.add(jb_copy);

        JLabel jjiami = new JLabel("***************************要加密的文件目标地址 ：        ");
        JTextArea jtjiami = new JTextArea(2, 30);
        jtjiami.setText("E://测试用文件.txt");
        this.add(jjiami);
        this.add(jtjiami);

        JLabel jjiaafter = new JLabel("***************************加密后的文件目标地址 ：        ");
        JTextArea jtjiaafter = new JTextArea(2, 30);
        jtjiaafter.setText("D://加密后的测试用文件.txt");
        this.add(jjiaafter);
        this.add(jtjiaafter);

        JLabel jiami = new JLabel("加密密码:");
        this.add(jiami);
        //设置加密密码
        JTextArea jtdayjia = new JTextArea(2, 6);
        jtdayjia.setText("19940805");
        this.add(jtdayjia);
        //校验码
        JTextArea jtheightjia = new JTextArea(2, 4);
        jtheightjia.setText("185");
        this.add(jtheightjia);

        JButton jb_jiami = new JButton("  文  件            加  密  ");
        jb_jiami.setBorderPainted(false);
        jb_jiami.setFocusable(false);
        this.add(jb_jiami);

        JLabel jjiemi = new JLabel("***************************要解密的文件目标地址 ：        ");
        JTextArea jtjiemi = new JTextArea(2, 30);
        jtjiemi.setText("D://加密后的测试用文件.txt");
        this.add(jjiemi);
        this.add(jtjiemi);

        JLabel jjieafter = new JLabel("***************************解密后的文件目标地址 ：        ");
        JTextArea jtjieafter = new JTextArea(2, 30);
        jtjieafter.setText("E://解密后的测试用文件.txt");
        this.add(jjieafter);
        this.add(jtjieafter);

        JLabel jiemi = new JLabel("解密密码:");
        this.add(jiemi);
        //设置解密密码
        JTextArea jtdayjie = new JTextArea(2, 6);
        jtdayjie.setText("19940805");
        this.add(jtdayjie);
        //校验码
        JTextArea jtheightjie = new JTextArea(2, 4);
        jtheightjie.setText("185");
        this.add(jtheightjie);

        JButton jb_jiemi = new JButton("  文  件            解  密  ");
        jb_jiemi.setBorderPainted(false);
        jb_jiemi.setFocusable(false);
        this.add(jb_jiemi);

        //用以反馈当前文件处理状态
        JLabel now = new JLabel();
        this.add(now);

        //给按钮添加监听器
        MainIOListener il = new MainIOListener(jp1, jp2, jp3, jtfore, jtafter, jtjiami, jtjiaafter, jtjiemi, jtjieafter, jtdayjia,
                jtheightjia, jtdayjie, jtheightjie, now);
        jb_write.addActionListener(il);
        jb_read.addActionListener(il);
        jb_copy.addActionListener(il);
        jb_jiami.addActionListener(il);
        jb_jiemi.addActionListener(il);

        this.setVisible(true);
    }

    /**
     * 添加背景的方法
     */
    private void addBackground() {
        ImageIcon image = new ImageIcon(this.getClass().getResource("123.jpg"));
        JLabel jlaImage = new JLabel(image);
        jlaImage.setBounds(0, -35, image.getIconWidth(), image.getIconHeight());
        this.getLayeredPane().add(jlaImage, new Integer(Integer.MIN_VALUE));
        JPanel contentpane = (JPanel) this.getContentPane();
        contentpane.setOpaque(false);
    }

}
