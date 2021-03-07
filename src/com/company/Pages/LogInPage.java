package com.company.Pages;

import com.company.Instruments.User;
import com.company.Tools.PopUps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LogInPage extends JFrame implements ActionListener {

    public JButton login;
    public JTextField username;
    public JTextField password;
    public JButton goToRegister;
    public ArrayList<User> users;


    public LogInPage(ArrayList<User> users) {

        super("Login");
        this.users = users;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 300);
        setLayout(new GridLayout(0, 1));

        login = new JButton("Login");
        login.addActionListener(this);
        add(login);

        username = new JTextField("filip");
        add(username);
        password = new JTextField("123456789");
        add(password);

        goToRegister = new JButton("Go to register");
        goToRegister.addActionListener(this);
        add(goToRegister);


    }

    public void logInButtonAction() {
        boolean isTrue = false;
        for (int i = 0; i < this.users.size(); i++) {
            User newUser = this.users.get(i);
            if (newUser.getUsername().equals(this.username.getText() )) {
                if(newUser.getPassword().equals(this.password.getText())) {
                    SearchPage searchPage = new SearchPage(this.users);
                    searchPage.setVisible(true);
                    setVisible(false);

               isTrue = true;
                }
            }
        }
      if (!isTrue){
          PopUps.errorMassage("Wrong Username or Password");
      }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            logInButtonAction();

        } else if (e.getSource() == goToRegister) {
            RegisterPage registerPage = new RegisterPage(users);
            registerPage.setVisible(true);
            setVisible(false);
        }

    }
}
