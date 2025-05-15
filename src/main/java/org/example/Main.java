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
        System.out.println("What a great name you have, "+ userName +"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        remainder3 = Integer.parseInt(sc.nextLine());
        remainder5 = Integer.parseInt(sc.nextLine());
        remainder7 = Integer.parseInt(sc.nextLine());

        userAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is "+ userAge +"; that's a good time to start programming!");

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int response = sc.nextInt();

        do{
            if(response != 2){
                System.out.println("Please, try again!");
            }
            response = sc.nextInt();
        }while(response != 2);

        System.out.println("Congratulations, have a nice day!");
    }
}