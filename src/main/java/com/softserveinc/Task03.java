package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("Write how many ml of water the coffee machine has: ");
        System.out.print(">>> ");
        int water;
        water = scanner.nextInt();
//
        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.print(">>> ");
        int milk;
        milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.print(">>> ");
        int coffee;
        coffee = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        System.out.print(">>> ");
        int cups;
        cups = scanner.nextInt();

        int minCups = 0;
        int minWater = water / 200;
        int minMilk = milk / 50;
        int minCoffee = coffee / 15;
        minCups = minWater;
        if (minMilk < minCups) {
            minCups = minMilk;
        }
        if (minCoffee < minCups) {
            minCups = minCoffee;
        }
        if (cups == minCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups > minCups) {
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
        } else  {
            System.out.println("Yes, I can make that amount of coffee (and even " + (minCups - cups) + " more than that)");
        }



    }
}
