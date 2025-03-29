package net.doole.banking;

import java.util.concurrent.atomic.AtomicInteger;
import net.doole.banking.ANSI;

import static net.doole.banking.ANSI.GREEN;
import static net.doole.banking.ANSI.RED;
import static net.doole.banking.ANSI.CYAN;
import static net.doole.banking.ANSI.RESET;
import static net.doole.banking.ANSI.YELLOW;

public class Accounts {

    private static final AtomicInteger accountCounter = new AtomicInteger(100000);
    private final int accountNumber;
    private double funds;

    // ANSI color codes

    public Accounts(){
        this.accountNumber = accountCounter.getAndIncrement();
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
            System.out.println(GREEN + "Added £"+ amount +" to account "+ accountNumber + RESET);
        }else {
            System.out.println(RED + "Invalid amount. Must be greater than 0." + RESET);
        }
    }

    // Color-coded balance display

    public String getFormattedBalance(){
        if(funds >= 5000) {
            return GREEN + String.format("£%.2f", funds) + RESET;
        } else if (funds >= 1000) {
            return CYAN + String.format("£%.2f", funds) + RESET;
        }else {
            return RED + String.format("£%.2f", funds) + RESET;
        }
    }
}
