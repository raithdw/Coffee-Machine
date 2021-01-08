package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner input = new Scanner(System.in);
    static int currentWater = 400;
    static int currentMilk = 540;
    static int currentCoffeeBeans = 120;
    static int currentDisposableCups = 9;
    static int currentMoney = 550;

    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = input.next();
        do {
            switch (action) {
                case "buy":
                    System.out.println(); buy(); System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = input.next(); break;
                case "fill":
                    System.out.println();fill(); System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = input.next(); break;
                case "take":
                    System.out.println();take(); System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = input.next(); break;
                case "remaining":
                    System.out.println();remaining(); System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = input.next(); break;
            }
        }while (!action.equals("exit"));

    }

    public static void buy() {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy? " +
                           "1 - espresso, " +
                           "2 - latte, " +
                           "3 - cappuccino," +
                           " back - to main menu:");
        String choice = input.next();
        switch (choice) {
            case "1":
                if (currentWater < 250) {
                    System.out.println("Sorry, not enough water!\n"); break;
                } else if (currentCoffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!\n"); break;
                } else if (currentDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n"); break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    currentWater -= 250;
                    currentCoffeeBeans -= 16;
                    currentMoney += 4;
                    currentDisposableCups--;
                    break;
                }
            case "2":
                if (currentWater < 350) {
                    System.out.println("Sorry, not enough water!\n"); break;
                } else if (currentMilk < 75) {
                    System.out.println("Sorry, not enough milk!\n"); break;
                } else if (currentCoffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!\n"); break;
                } else if (currentDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n"); break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    currentWater -= 350;
                    currentMilk -= 75;
                    currentCoffeeBeans -= 20;
                    currentMoney += 7;
                    currentDisposableCups--;
                    break;
                }

            case "3":
                if (currentWater < 200) {
                    System.out.println("Sorry, not enough water!\n"); break;
                } else if (currentMilk < 100) {
                    System.out.println("Sorry, not enough milk!\n"); break;
                } else if (currentCoffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!\n"); break;
                } else if (currentDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n"); break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    currentWater -= 200;
                    currentMilk -= 100;
                    currentCoffeeBeans -= 12;
                    currentMoney += 6;
                    currentDisposableCups--;
                    break;
                }
            case "back": break;

        }

    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = input.nextInt();
        currentWater += addWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = input.nextInt();
        currentMilk += addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffeeBeans = input.nextInt();
        currentCoffeeBeans += addCoffeeBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addDisposableCups = input.nextInt();
        currentDisposableCups += addDisposableCups;
        System.out.println();
    }

    public static void take() {
        System.out.println("I gave you $" + currentMoney + "\n");
        currentMoney = 0;
    }

    public static void remaining() {
        System.out.println("The coffee machine has:\n" +
                currentWater + " of water\n" +
                currentMilk + " of milk\n" +
                currentCoffeeBeans + " of coffee beans\n" +
                currentDisposableCups + " of disposable cups\n" +
                currentMoney + " of money\n");
    }
}
