package com.company;

import javax.swing.*;

public class HomeForm extends JFrame{
    private JButton button1;
    private JButton button2;
    private JPanel rootPanel;
    private JLabel username;
    private JLabel firstname;
    private JLabel lastname;

    HomeForm(String firstname, String lastname, String username){
        add(rootPanel);
        setTitle("GUI demo");
        setSize(400, 200);

        this.firstname.setText(" Firstname : "+firstname);
        this.lastname.setText(" Lastname : "+lastname);
        this.username.setText(" Username : "+username);
    }
}
