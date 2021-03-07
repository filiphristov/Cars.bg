package com.company;

import com.company.Instruments.Advertisement;
import com.company.Instruments.User;
import com.company.Pages.MainPage;
import com.company.Tools.UserType;

import java.util.ArrayList;


public class Main {
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Advertisement>  advertisements=new ArrayList<>();
    public static void main(String[] args) {

        User a = new User("filip", "123456789", "Filip", "Hristov", 25, "0893444068");
        a.setType(UserType.ADMIN);
        User b = new User("didaka", "123456789", "Dimitar", "Ivanov", 22, "0892444068");
        b.setType(UserType.VIP);
        User c = new User("minkata", "123456789", "Marin", "Georgiev", 25, "0891444068");
        c.setType(UserType.REGULAR);

        users.add(a);
        users.add(b);
        users.add(c);

        Advertisement a1 = new Advertisement("Tesla", "Model S ", "10000", 50000, a.getUsername(), a.getPhoneNumber());
        Advertisement b1 = new Advertisement("BMW", "E46 ", "500000", 2500, b.getUsername(), b.getPhoneNumber());
        Advertisement c1 = new Advertisement("Mercedes-Benz", "S Class", "50000", 25000, c.getUsername(), c.getPhoneNumber());

        MainPage mainPage = new MainPage(users);
        mainPage.setVisible(true);
    }

}
