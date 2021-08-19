package HyperSkill.CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        numberOfServings();

    }

    public static void supplyCounter () {
        Scanner in = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cups = in.nextInt();
        System.out.printf("For %d cups of coffee you will need\n", cups);
        System.out.printf("%d ml of water\n", 200 * cups);
        System.out.printf("%d ml of milk\n", 50 * cups);
        System.out.printf("%d g of coffee beans\n", 15 * cups);
    }

    public static void numberOfServings() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = in.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = in.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = in.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsWant = in.nextInt();
        int cupsCan = Math.min(Math.min(water / 200, milk / 50), beans / 15);
        if (cupsCan > cupsWant) System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", cupsCan - cupsWant);
        else if (cupsCan == cupsWant) System.out.println("Yes, I can make that amount of coffee");
        else System.out.printf("No, I can make only %d cup(s) of coffee", cupsCan);
    }
}