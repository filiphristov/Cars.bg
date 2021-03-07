package com.company.Instruments;

import com.company.Tools.UserType;

public class User {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public int age;
    private UserType type;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(String username, String password, String firstName, String lastName, int age, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber=phoneNumber;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserType getType() {
        return type;
    }
    public String toString() {
        return this.firstName + " " + lastName + " " + " на " + this.age + " " + "години";
    }


}
