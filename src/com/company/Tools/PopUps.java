package com.company.Tools;

import javax.swing.*;

public class PopUps  extends JFrame {

    public static void errorMassage(String massage){

        JOptionPane.showMessageDialog(null,massage,"Error",JOptionPane.ERROR_MESSAGE);

    }
    public static void success(){

        JOptionPane.showMessageDialog(null,"Congratulations","Success",JOptionPane.PLAIN_MESSAGE);
    }


}
