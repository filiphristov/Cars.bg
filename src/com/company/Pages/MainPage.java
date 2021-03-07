package com.company.Pages;

import com.company.Instruments.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainPage extends JFrame implements ActionListener {
    public ArrayList<User> users;
    public JButton login;
    public JButton register;

    public MainPage(ArrayList<User> users) {
        super("Main Page");
        this.users = users;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(100, 200);
        setLayout(new GridLayout(0, 1));

        login = new JButton("Login");
        register = new JButton("Register");
        login.addActionListener(this);
        register.addActionListener(this);
        add(login);
        add(register);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            LogInPage logInPage = new LogInPage(users);
            logInPage.setVisible(true);


        } else {
            RegisterPage registerPage = new RegisterPage(users);
            registerPage.setVisible(true);
        }

    }
}
