package com.jaewook;

import javax.swing.*;
import java.awt.*;

public class 제이프레임 extends JFrame {

    public 제이프레임(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        제이프레임 frame = new 제이프레임("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame By Example");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
