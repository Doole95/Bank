package net.doole.banking;


import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

public class Users {

    public String name;
    public int id;
    public int age;
    private final Accounts account;

    // ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";

    public Users(String name, int id, int age, Accounts account) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.account = account;
    }

    public int getAccountNumber(){
        return account.getAccountNumber();
    }


    public static final List<Users> people = Arrays.asList(
            new Users("John Doe", 1234, 25, new Accounts()),
            new Users("Jane Smith", 5678, 30, new Accounts()),
            new Users("Sam Wilson", 9101, 28, new Accounts()),
            new Users("Olivia Brown", 1122, 35, new Accounts()),
            new Users("Liam Johnson", 3344, 22, new Accounts()),
            new Users("Emma Davis", 5567, 27, new Accounts()),
            new Users("Ava Taylor", 7788, 15, new Accounts()),    // Under 16
            new Users("Noah White", 8899, 14, new Accounts()),    // Under 16
            new Users("Sophia Green", 9900, 12, new Accounts()),  // Under 16
            new Users("Lucas Black", 2233, 18, new Accounts())
    );

    public static List<Users> getPeople() {
        return people;
    }

    public String getFormattedOutput(){
        return RED + "Name: " + RESET + name + " " +
                GREEN + "ID: " + RESET + id + " " +
                CYAN + "Age: " + RESET + age + " " +
                YELLOW + "Account: " + RESET + getAccountNumber();
    }



}
