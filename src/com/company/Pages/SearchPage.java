package com.company.Pages;

import com.company.Instruments.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchPage extends JFrame implements ActionListener {
    public ArrayList<User> users;
    public JButton search;
    public DefaultTableModel tableModel;


    public SearchPage(ArrayList<User> users) {
        super("Welcome");
        this.users = users;

        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(350, 250);
        setLayout(new GridLayout(0, 1));
        setVisible(true);
        tableModel = new DefaultTableModel();
        String column[] = {"Brand", "Model", "Millage","Price", "Seller", "Phone", "Location"};
        tableModel.setColumnIdentifiers(column);
        JTable jTable = new JTable(tableModel);
        add(new JScrollPane(jTable));
        refreshTableData();
    }
    public void  refreshTableData(){
        Object row[] = new Object[7];
        row[0]= "Audi";
        row[1]= "a6";
        row[2]= "25000";
        row[3]= "250000";
        row[4]= "Ivan ot selo";
        row[5]= "12312312";
        row[6]= "Selo Kesten";
        tableModel.addRow(row);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
