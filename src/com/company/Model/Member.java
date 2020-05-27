package com.company.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Member {
    String firstname,lastname,username,password;

    public static ArrayList<Member> memberList = new ArrayList<>();
    public static int SumaryMember = 0;

    public Member(){ }

    public Member(String firstname, String lastname, String username,String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;


        SumaryMember++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    @Override
    public String toString() {

        return super.toString();


    }
}
