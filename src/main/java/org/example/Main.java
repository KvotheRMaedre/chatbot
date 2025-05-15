package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String botName = "Kvothe";
        String userName;
        int remainder3;
        int remainder5;
        int remainder7;
        int userAge;
        int botBirthdayYear = 2025;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + botBirthdayYear + ".");

        System.out.println("Please, remind me your name.");
        userName = sc.nextLine();
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        remainder3 = Integer.parseInt(sc.nextLine());
        remainder5 = Integer.parseInt(sc.nextLine());
        remainder7 = Integer.parseInt(sc.nextLine());

        userAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is "+ userAge +"; that's a good time to start programming!");

    }
}