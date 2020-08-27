package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    // Private Static Statements
    private static JLabel user;
    private static JTextField user_prompt;
    private static JLabel password_text;
    private static JPasswordField password_prompt;
    private static JButton login;
    private static JLabel success;

    public static void main(String[] args) {
	// write your code here

        // Creating new JFrame and JPanel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // Frame Settings
        frame.setSize(300, 210);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        System.out.println("Running Login Application");

        // In-App Components
        // Username
        user = new JLabel("Username");
        user.setBounds(10, 10, 80, 25);
        panel.add(user);

        user_prompt = new JTextField();
        user_prompt.setBounds(100, 10, 165, 25);
        panel.add(user_prompt);

        // Password
        password_text = new JLabel("Password:");
        password_text.setBounds(10, 60, 80, 25);
        panel.add(password_text);

        password_prompt = new JPasswordField();
        password_prompt.setBounds(100, 60, 165, 25);
        panel.add(password_prompt);

        // Button to Login
        login = new JButton("Login");
        login.setBounds(10, 100, 265, 50);
        login.addActionListener(new Main());
        panel.add(login);

        success = new JLabel("");
        success.setBounds(10, 120, 80, 25);
        panel.add(success);

        // Main App Visibility
        frame.setVisible(true); // Keep this at the Bottom of the File at all times


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Getting the User's information
        String users = user_prompt.getText();
        String password = password_prompt.getText();

        if(users.equals("lMwenda") && password.equals("Lukemwen")){
            success.setText("Successfully logged in!");
        }
    }
}
