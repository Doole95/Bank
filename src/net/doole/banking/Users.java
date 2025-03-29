package net.doole.banking;


import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import net.doole.banking.ANSI;

public class Users {

    public String name;
    public int id;
    public int age;
    private final Accounts account;


    public Users(String name, int id, int age, Accounts account) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.account = account;
    }

    public int getAccountNumber(){
        return account.getAccountNumber();
    }

    public double getFunds(){
        return account.getFunds();
    }

    public void addFunds(double amount){
        account.addFunds(amount);
    }

    public void removeFunds(double amount) {
        account.removeFunds(amount);
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
        return ANSI.RED + "Name: " + ANSI.WHITE + name + " " +
                ANSI.GREEN + "ID: " + ANSI.WHITE + id + " " +
                ANSI.CYAN + "Age: " + ANSI.WHITE + age + " " +
                ANSI.YELLOW + "Account: " + ANSI.WHITE + getAccountNumber() + " " +
                ANSI.BLUE + "Balance: " + ANSI.WHITE + account.getFormattedBalance();
    }



}
