package com.okseby;

import com.okseby.Window.Window;

import java.awt.*;

public class Main {
    static String title = "Hello World!";
    static Dimension d = new Dimension(1600, 900);

    public static void main(String[] args) {
        initializeCore();
    }

    public static void initializeCore() {
        Window w = new Window();

        w.createWindow(title, d);
    }
}
