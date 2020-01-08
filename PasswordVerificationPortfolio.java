package us.cameron.passwdverification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a password: ");
        String password = input.nextLine().replaceAll("\\s", ""); // Replace all spaces with nothing to get the correct length of the password.
        // I have removed the boolean variable because we don't need it.
        if (!(password.length() >= 8)) {
            System.out.println("Password must have at least 8 characters.");
        // I don't think it's that efficient to loop through all of the 
        // characters in the string. Instead, we can check the password against a regex expression to see if the password doesn't contain any special characters (like $, %, or !).
        } else if (!(password.matches("^[a-zA-Z0-9_.-]*$"))) {
            System.out.println("Password must only contain letters and digits.");
        } else {
            System.out.println("Password accepted!");
        }
    }
}
