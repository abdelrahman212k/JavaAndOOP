package Basics;

import java.util.Scanner;

public class ScanInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number = input.nextInt();
//        System.out.print("You've entered: " + number);

        // Scanning only 1 char from user
        System.out.print("Please enter 1 character: ");
        char character = input.next().charAt(0);
        System.out.print("You entered: " + character);
        System.out.printf("%nYou entered %C", character);
    }
}
