package com.ytt.jdk.jframe.project.jiamijiemi;

/**
 * Created by ytt on 2019/1/4.
 */


import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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

        //--------------------------------加密
        JLabel jjiami = new JLabel("要加密的文件目标地址 ：        ");
        JTextArea jtjiami = new JTextArea(2, 30);
        jtjiami.setText("E://测试用文件.txt");
        this.add(jjiami);
        this.add(jtjiami);

        JLabel jjiaafter = new JLabel("加密后的文件目标地址 ：        ");
        JTextArea jtjiaafter = new JTextArea(2, 30);
        jtjiaafter.setText("D://加密后的测试用文件.txt");
        this.add(jjiaafter);
        this.add(jtjiaafter);

        JLabel jiami = new JLabel("加密密码:");
        this.add(jiami);
        //设置加密密码
        JTextArea jtdayjia = new JTextArea(2, 6);
        jtdayjia.setText("123");
        this.add(jtdayjia);
        //校验码
        JTextArea jtheightjia = new JTextArea(2, 4);
        jtheightjia.setText("123");
        this.add(jtheightjia);

        JButton jb_jiami = new JButton("  文  件            加  密  ");
        jb_jiami.setBorderPainted(false);
        jb_jiami.setFocusable(false);
        this.add(jb_jiami);

        //---------------------------解密

        JLabel fege = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------");
        this.add(fege);
        JLabel jjiemi = new JLabel("要解密的文件目标地址 ：        ");
        JTextArea jtjiemi = new JTextArea(2, 30);
        jtjiemi.setText("D://加密后的测试用文件.txt");
        this.add(jjiemi);
        this.add(jtjiemi);

        JLabel jjieafter = new JLabel("解密后的文件目标地址 ：        ");
        JTextArea jtjieafter = new JTextArea(2, 30);
        jtjieafter.setText("E://解密后的测试用文件.txt");
        this.add(jjieafter);
        this.add(jtjieafter);

        JLabel jiemi = new JLabel("解密密码:");
        this.add(jiemi);
        //设置解密密码
        JTextArea jtdayjie = new JTextArea(2, 6);
        jtdayjie.setText("123");
        this.add(jtdayjie);
        //校验码
        JTextArea jtheightjie = new JTextArea(2, 4);
        jtheightjie.setText("123");
        this.add(jtheightjie);

        JButton jb_jiemi = new JButton("  文  件            解  密  ");
        jb_jiemi.setBorderPainted(false);
        jb_jiemi.setFocusable(false);
        this.add(jb_jiemi);

        //用以反馈当前文件处理状态
        JLabel now = new JLabel();
        this.add(now);

        //给按钮添加监听器
        MainIOListener il = new MainIOListener(jtjiami, jtjiaafter, jtjiemi, jtjieafter, jtdayjia,
                jtheightjia, jtdayjie, jtheightjie, now);
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
