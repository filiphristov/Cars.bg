package com.company.Pages;

import com.company.Instruments.User;
import com.company.Tools.Helper;
import com.company.Tools.PopUps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterPage extends JFrame implements ActionListener {

    public JButton register;
    public JTextField username;
    public JTextField password;
    public JTextField firstName;
    public JTextField lastName;
    public JTextField age;
    public ArrayList<User> users;
    public String[] jComboBoxStrings = {"Male", "Female"};
    public JComboBox sex;
    public JTextField phoneNumber;


    public RegisterPage(ArrayList<User> users) {
        super("Register Page");
        this.users = users;
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(500, 300);
        setLayout(new GridLayout(0, 1));

        register = new JButton("Register");
        username = new JTextField("Username 6 digits minimum");
        password = new JTextField("Password 8 digits minimum");
        firstName = new JTextField("First Name");
        lastName = new JTextField("Last Name");
        age = new JTextField("Years");
        sex = new JComboBox(jComboBoxStrings);
        phoneNumber=new JTextField("Phone Number");
        add(register);
        add(username);
        add(password);
        add(firstName);
        add(age);
        add(sex);
        add(phoneNumber);

        register.addActionListener(this);
    }

    public void registration() {
        for (int i = 0; i < this.users.size(); i++) {
            User newUs = this.users.get(i);
            String isskka = username.getText();
            if (isskka.toLowerCase().equals(newUs.getUsername().toLowerCase())) {
                PopUps.errorMassage("This username is taken");
                return;
            }
        }
        if (username.getText().length() < 8) {
            PopUps.errorMassage("The Username have to be least 8 digits");
            return;
        }
        if (password.getText().length() < 8) {
            PopUps.errorMassage("The Password have to be least 8 digits");
            return;
        }
        if (firstName.getText().contains("1" + "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9" + "0")) {
            PopUps.errorMassage("You cant have numbers in your name");
            return;
        }
        if (lastName.getText().contains("1" + "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9" + "0")) {
            PopUps.errorMassage("You cant have numbers in your name");
            return;
        }
        if (Helper.numberCheck(age.getText())) {
            PopUps.errorMassage("Please enter numbers in the field *> Years <*");
            return;
        }
        if (Helper.integerParserFromString(age.getText()) < 16) {
            PopUps.errorMassage("You have to be 16 or older");
            return;
        }
        if (phoneNumber.getText().length()<10){
            PopUps.errorMassage("Phone number have to be  10 digits");
        }

        String usernameText = username.getText();
        String passwordText = password.getText();
        String firstNameText = firstName.getText();
        String lastNameText = lastName.getText();
        int ageNumber = Helper.integerParserFromString(age.getText());
        String phoneNumberText = phoneNumber.getText();

        User user1 = new User(usernameText, passwordText, firstNameText, lastNameText, ageNumber,phoneNumberText);
        users.add(user1);
        PopUps.success();
        LogInPage logInPage = new LogInPage(users);
        logInPage.setVisible(true);
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == register) {
            registration();
        }
    }
}
