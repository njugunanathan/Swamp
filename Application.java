package Seal;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Job Application Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);

        // Use BorderLayout for the frame
        frame.setLayout(new BorderLayout());

        // Panel for form fields using GridLayout
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        // Full Name
        formPanel.add(new JLabel("Full Name:"));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);

        // Telephone
        formPanel.add(new JLabel("Telephone:"));
        JTextField phoneField = new JTextField();
        formPanel.add(phoneField);

        // Gender (Radio Buttons)
        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        formPanel.add(genderPanel);

        // Position Applied (ComboBox)
        formPanel.add(new JLabel("Position Applied:"));
        JComboBox<String> positionBox = new JComboBox<>(new String[]{
            "Manager", "Developer", "Accountant", "Analyst"
        });
        formPanel.add(positionBox);

        // Salary
        formPanel.add(new JLabel("Expected Salary:"));
        JTextField salaryField = new JTextField();
        formPanel.add(salaryField);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);

        // Add panels to frame
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}

