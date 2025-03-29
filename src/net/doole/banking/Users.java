package net.doole.banking;


import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

public class Users {

    public String name;
    public int id;
    public int age;

    // ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";

    public Users(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public static final List<Users> people = Arrays.asList(
            new Users("John Doe", 1234, 25),
            new Users("Jane Smith", 5678, 30),
            new Users("Sam Wilson", 9101, 28),
            new Users("Olivia Brown", 1122, 35),
            new Users("Liam Johnson", 3344, 22),
            new Users("Emma Davis", 5567, 27),
            new Users("Ava Taylor", 7788, 15),    // Under 16
            new Users("Noah White", 8899, 14),    // Under 16
            new Users("Sophia Green", 9900, 12),  // Under 16
            new Users("Lucas Black", 2233, 18)
    );

    public static List<Users> getPeople() {
        return people;
    }

    public String getFormattedOutput(){
        return RED + "Name: " + RESET + name + " " +
                GREEN + "ID: " + RESET + id + " " +
                CYAN + "Age: " + RESET + age;
    }



}
