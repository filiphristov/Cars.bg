package com.company.Tools;

import javax.swing.*;

public class Helper extends JFrame {

    public static boolean numberCheck(String justSt) {
        try {
            Integer.parseInt(justSt);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static int integerParserFromString(String justSt) {

        return Integer.parseInt(justSt);
    }
}
