package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int waterPerCup = 200;
        int milkPerCup = 50;
        int beansPerCup = 15;
        int totalCups;

        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterInMachine = myObj.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkInMachine = myObj.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeansInMachine = myObj.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = myObj.nextInt();


        int waterMakesCups = waterInMachine / waterPerCup;
        int milkMakesCups = milkInMachine / milkPerCup;
        int beansMakesCups = coffeeBeansInMachine / beansPerCup;

        if (beansMakesCups <= waterMakesCups && beansMakesCups <= milkMakesCups) {
            totalCups = beansMakesCups;
        } else if (waterMakesCups <= beansMakesCups && waterMakesCups <= milkMakesCups) {
            totalCups = waterMakesCups;
        } else {
            totalCups = milkMakesCups;
        }

        int additionalCups = totalCups - cups;

        if (cups < totalCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + additionalCups + " more than that)");
        } else if (cups > totalCups) {
            System.out.println("No, I can only make " + totalCups + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

    }
}
