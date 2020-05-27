package com.company;

import com.company.Model.Member;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Member member1 = new Member("Taloengrat", "Poomchaiya", "ARMZlOW", "Armtp27122540");
        Member member2 = new Member("Wachayathorn", "Singsena", "NIGHTZlOW", "Nightws27122540");
        Member member3 = new Member("Kornkanok", "Rengratsamee", "REAWZlOW", "Reawkr27122540");

        Member.memberList.add(member1);
        Member.memberList.add(member2);
        Member.memberList.add(member3);

        System.out.println("Size : "+Member.memberList.size());
        System.out.println("Allmember in System : "+Member.memberList);

        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);


    }
}
