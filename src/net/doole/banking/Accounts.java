package net.doole.banking;

import java.util.concurrent.atomic.AtomicInteger;
import net.doole.banking.ANSI;

import net.doole.banking.ANSI;

public class Accounts {

    private static final AtomicInteger accountCounter = new AtomicInteger(100000);
    private final int accountNumber;
    private double funds;

    // ANSI color codes

    public Accounts(){
        this.accountNumber = accountCounter.getAndIncrement();
        this.funds = Math.random() * 10000;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getFunds() {
        return funds;
    }

    // Add funds with color-coded confirmation
    public void addFunds(double amount) {
        if(amount > 0) {
            funds += amount;
            System.out.println(ANSI.GREEN + "Added £"+ amount +" to account "+ accountNumber + ANSI.WHITE);
        }else {
            System.out.println(ANSI.RED + "Invalid amount. Must be greater than 0." + ANSI.WHITE);
        }
    }


    // Remove funds with color-coded confirmation
    public void removeFunds(double amount) {
        if (amount > 0 && amount <= funds) {
            funds -= amount;
            System.out.println(ANSI.RED + "Removed £" + amount + " from account " + accountNumber + ANSI.WHITE);
        } else {
            System.out.println(ANSI.RED + "Invalid amount or insufficient funds." + ANSI.WHITE);
        }
    }

    // Color-coded balance display

    public String getFormattedBalance(){
        if(funds >= 5000) {
            return ANSI.GREEN + String.format("£%.2f", funds) + ANSI.WHITE;
        } else if (funds >= 1000) {
            return ANSI.CYAN + String.format("£%.2f", funds) + ANSI.WHITE;
        }else {
            return ANSI.RED + String.format("£%.2f", funds) + ANSI.WHITE;
        }
    }
}
