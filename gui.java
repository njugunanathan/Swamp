package Gio;

import javax.swing.*;  // Correct import

public class gui {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create a button
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");

        // Add button to frame
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button1);

        // Make frame visible
        frame.setVisible(true);
    }
}