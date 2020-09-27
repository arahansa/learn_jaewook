package com.jaewook;

import com.jaewook.조건문.랜덤조건;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class 제이프레임 extends JFrame {

    public 제이프레임(String title) throws HeadlessException {
        super(title);
    }



    public static void main(String[] args) throws IOException {
        com.jaewook.조건문.랜덤조건 랜덤조건 = new 랜덤조건();

        제이프레임 frame = new 제이프레임("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("JFrame By Example");
        JButton button = new JButton();
        button.setText("Button");
        button.addActionListener(l->{
            label.setText(랜덤조건.get홀짝());
            System.out.println("버튼클릭");
        });

        panel.add(label);
        panel.add(button);

        BufferedImage myPicture = ImageIO.read(new File("masterlee.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        panel.add(picLabel);

        frame.add(panel);
        frame.setSize(1024, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
