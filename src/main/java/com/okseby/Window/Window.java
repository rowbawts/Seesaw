package com.okseby.Window;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public void createWindow(String title, Dimension d) {
        FlatLightLaf.setup();

        JFrame frame = new JFrame(title);
        JPanel panel = new JPanel();
        JButton button1 = new JButton("test1");
        JButton button2 = new JButton("test2");

        panel.add(button1);
        panel.add(button2);

        frame.add(panel);

        frame.setSize(d);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
