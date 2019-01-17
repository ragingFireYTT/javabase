package com.ytt.jdk.jframe.project.jiamijiemi;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MainIOListener implements ActionListener {

    private JTextArea jp1, jp2, jp3, jtfore, jtafter, jtjiami, jtjiaafter, jtjiemi, jtjieafter;
    private JTextArea jtdayjia, jtheightjia, jtdayjie, jtheightjie;
    private JLabel now;

    public MainIOListener(
            JTextArea jtjiami,
            JTextArea jtjiaafter, JTextArea jtjiemi, JTextArea jtjieafter, JTextArea jtdayjia,
            JTextArea jtheightjia, JTextArea jtdayjie, JTextArea jtheightjie, JLabel now) {
        this.jp1 = jp1;
        this.jp2 = jp2;
        this.jp3 = jp3;
        this.jtfore = jtfore;
        this.jtafter = jtafter;
        this.jtjiami = jtjiami;
        this.jtjiaafter = jtjiaafter;
        this.jtjiemi = jtjiemi;
        this.jtjieafter = jtjieafter;
        //String装换为int
        this.jtdayjia = jtdayjia;
        this.jtdayjie = jtdayjie;
        this.jtheightjia = jtheightjia;
        this.jtheightjie = jtheightjie;

        this.now = now;
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("写入文件")) {
            JavaIO jio = new JavaIO();
            try {
                jio.writeFile(jp3.getText(), jp2.getText() + jp1.getText());
                now.setText("文件已写入");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else if (e.getActionCommand().equals("读取文件")) {
            JavaIO jio = new JavaIO();
            jio.readFile(jp2.getText() + jp1.getText());
            now.setText("文件已读取");

        } else if (e.getActionCommand().equals("  复  制            文  件  ")) {
            JavaIO jio = new JavaIO();
            try {
                jio.copy(jtfore.getText(), jtafter.getText());
                now.setText("文件已复制");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else if (e.getActionCommand().equals("  文  件            加  密  ")) {
            JavaIO jio = new JavaIO();
            try {
                jio.JiaMi(jtjiami.getText(), jtjiaafter.getText(), Integer.parseInt(jtdayjia.getText()), Integer.parseInt(jtheightjia.getText()) );
                now.setText("文件已加密");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else if (e.getActionCommand().equals("  文  件            解  密  ")) {
            JavaIO jio = new JavaIO();
            try {
                jio.JieMi(jtjiemi.getText(), jtjieafter.getText(),Integer.parseInt(jtdayjie.getText()), Integer.parseInt(jtheightjie.getText()));
                now.setText("文件已解密");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}
