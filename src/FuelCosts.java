import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double gasPrice = 0;
        double milesPerGallon = 0;
        double gasTank = 0;
        double priceToDrive = 0;
        double maxDrive = 0;
        boolean done = false;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" Enter the gas price of a gallon of gas ");
            if (input.hasNextDouble())
                gasPrice = input.nextDouble();
            System.out.println(" Enter the miles per gallon of your vehicle ");
            if (input.hasNextDouble())
                milesPerGallon = input.nextDouble();
            System.out.println(" Enter the gas tank quantity of your vehicle ");
            if (input.hasNextDouble())
                gasTank = input.nextDouble();

            priceToDrive = 100 / milesPerGallon * gasPrice;

            maxDrive = milesPerGallon * gasTank;

            System.out.println(" The cost to drive 100 miles is " + priceToDrive);
            System.out.println(" \n ");
            System.out.println(" The max distance you can drive on a full tank of gas is " + maxDrive);
        } while (!done);
    }

    }
