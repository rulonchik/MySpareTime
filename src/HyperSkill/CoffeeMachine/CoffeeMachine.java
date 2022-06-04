package HyperSkill.CoffeeMachine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner inm = new Scanner(System.in);
        Coffee espresso = new Coffee(250, 0, 16, 1, 4);
        Coffee latte = new Coffee(350, 75, 20, 1, 7);
        Coffee cappuccino = new Coffee(200, 100, 12, 1, 6);
        Coffee machine = new Coffee(400, 540, 120, 9, 550);
        while (true) {
            currentSupplyStatus(machine);
            System.out.println("Write action (buy, fill, take):");
            String command = inm.nextLine();
            switch (command) {
                case "buy":
                    buy(espresso, latte, cappuccino, machine);
                    break;
                case "fill":
                    fill(machine);
                    break;
                case "take":
                    take(machine);
                    break;
            }
        }

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

    public static void buy(Coffee esp, Coffee lat, Coffee cap, Coffee mac) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        switch (in.nextLine()) {
            case "1":
                mac.setWater(mac.getWater() - esp.getWater());
                mac.setMilk(mac.getMilk() -  esp.getMilk());
                mac.setBeans(mac.getBeans() - esp.getBeans());
                mac.setCups(mac.getCups() -  esp.getCups());
                mac.setCost(mac.getCost() +  esp.getCost());
                break;
            case "2":
                mac.setWater(mac.getWater() - lat.getWater());
                mac.setMilk(mac.getMilk() -  lat.getMilk());
                mac.setBeans(mac.getBeans() - lat.getBeans());
                mac.setCups(mac.getCups() -  lat.getCups());
                mac.setCost(mac.getCost() +  lat.getCost());
                break;
            case "3":
                mac.setWater(mac.getWater() - cap.getWater());
                mac.setMilk(mac.getMilk() -  cap.getMilk());
                mac.setBeans(mac.getBeans() - cap.getBeans());
                mac.setCups(mac.getCups() -  cap.getCups());
                mac.setCost(mac.getCost() +  cap.getCost());
                break;
        }
    }

    public static void fill(Coffee mac) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int water = in.nextInt();
        mac.setWater(mac.getWater() + water);
        System.out.println("Write how many ml of milk you want to add:");
        int milk = in.nextInt();
        mac.setMilk(mac.getMilk() + milk);
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = in.nextInt();
        mac.setBeans(mac.getBeans() + beans);
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cups = in.nextInt();
        mac.setCups(mac.getCups() + cups);
    }

    public static void take(Coffee mac) {
        System.out.printf("I gave you %d$\n", mac.getCost());
        mac.setCost(0);
    }

    public static void currentSupplyStatus(Coffee mac) {
        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d ml of water\n", mac.getWater());
        System.out.printf("%d ml of milk\n", mac.getMilk());
        System.out.printf("%d g of coffee beans\n", mac.getBeans());
        System.out.printf("%d disposable cups\n", mac.getCups());
        System.out.printf("$%d of money\n\n", mac.getCost());
    }

    @SuppressWarnings("FieldMayBeFinal")
    public static class Coffee {
        private int cost;
        private int water;
        private int milk;
        private int cups;
        private int beans;

        public Coffee(int water, int milk, int beans, int cups, int cost) {
            this.water = water;
            this.milk = milk;
            this.beans = beans;
            this.cups = cups;
            this.cost = cost;
        }

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getBeans() {
            return beans;
        }

        public int getCups() {
            return cups;
        }

        public int getCost() { return cost;}

        public void setCost(int cost) {
            this.cost = cost;
        }

        public void setWater(int water) {
            this.water = water;
        }

        public void setMilk(int milk) {
            this.milk = milk;
        }

        public void setCups(int cups) {
            this.cups = cups;
        }

        public void setBeans(int beans) {
            this.beans = beans;
        }
    }

}