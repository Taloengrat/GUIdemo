package com.company;

import com.company.Model.Member;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame{
    private JTextField etFirstname;
    private JTextField etLastname;
    private JTextField etUsername;
    private JButton SUBMIT;
    private JPanel roorPanel;
    private JPasswordField etPassword;
    private boolean CheckVerify = false;

    Register(){
        add(roorPanel);
        setTitle("GUI demo");
        setSize(400, 200);

        SUBMIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (etFirstname.getText().isEmpty()){
                        JOptionPane.showMessageDialog(getParent(),"Please put your firstname!");
                    }else if (etLastname.getText().isEmpty()){
                        JOptionPane.showMessageDialog(getParent(),"Please put your lastname!");
                    }else if (etUsername.getText().isEmpty()){
                        JOptionPane.showMessageDialog(getParent(),"Please put your username!");
                    }else if (etPassword.getText().isEmpty()){
                        JOptionPane.showMessageDialog(getParent(),"Please put your password!");
                    }

                    else{

                        AddMemberInSystem(etFirstname.getText(), etLastname.getText(), etUsername.getText(), etPassword.getText());





                    }
                }catch (Exception ex){
                    ex.getMessage();
                }finally {


                    if (CheckVerify){
                        JOptionPane.showMessageDialog(getParent(),"Register Success :)");

                        System.out.println("Detail User : \n\t"+
                                etFirstname.getText()+"\n\t"+
                                etLastname.getText()+"\n\t"+
                                etUsername.getText()+"\n\t"+
                                etPassword.getText());

                        LoginForm loginForm = new LoginForm();
                        loginForm.setVisible(true);
                        hide();
                    }else{
                        System.out.println("Register Unsuccess :(");
                    }


                }

            }
        });
    }

    private void AddMemberInSystem(String firstname, String lastname, String username, String password) {

        for (int i = 0; i < Member.memberList.size(); i++){
            if (Member.memberList.get(i).getUsername().equals(username)){
                System.out.println("id: "+i);
                System.out.println("Username: "+Member.memberList.get(i).getUsername());
                JOptionPane.showMessageDialog(null, "This username is exist already!");
            }else if (Member.memberList.get(i).getPassword().equals(password)){
                JOptionPane.showMessageDialog(null, "This password is exist already!");
            }else if (i == (Member.memberList.size()-1)){
                Member member = new Member(firstname, lastname, username, password);
                Member.memberList.add(member);
            }
        }




    }


}
