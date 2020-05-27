package com.company;

import com.company.Model.Member;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel rootPanel;
    private JTextField etUsername;
    private JPasswordField etPassword;
    private JButton btLogin;
    private JButton RegisterForm;


    LoginForm(){


        add(rootPanel);
        setTitle("GUI demo");
        setSize(400, 200);

        RegisterForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                hide();
                Register register = new Register();
                register.setVisible(true);


            }
        });

        btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (etUsername.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please put your username");
                }else if (etPassword.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please put your password");
                }else {
                    verifyLogin(etUsername.getText(), etPassword.getText());
                }

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void verifyLogin(String username, String password){

        for (int i = 0 ; i < Member.memberList.size(); i++){

            if (Member.memberList.get(i).getUsername().equals(username) && Member.memberList.get(i).getPassword().equals(password)){
                HomeForm homeForm = new HomeForm(Member.memberList.get(i).getFirstname(), Member.memberList.get(i).getLastname(), Member.memberList.get(i).getUsername());
                homeForm.setVisible(true);
                this.hide();
            }else if (i == (Member.memberList.size()-1)){
                JOptionPane.showMessageDialog(null,"Username or password invalid!");
            }

        }



    }


}
