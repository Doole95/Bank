package net.doole;

import net.doole.banking.Users;

public class Main {
    public static void main(String[] args) {

        for(Users user : Users.getPeople()) {
            System.out.println(user.getFormattedOutput());
        }


    }
}