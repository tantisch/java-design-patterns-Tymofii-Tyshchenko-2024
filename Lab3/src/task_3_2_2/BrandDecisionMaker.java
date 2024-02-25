package task_3_2_2;

import task_3_2_2.factory.*;
import task_3_2_2.transport.Transport;

public class BrandDecisionMaker {

    private static Transport[] createTransports(TransportFactory factory, int numberBuses, int numberTrolleybuses, int numberTrams) {
        Transport[] transports = new Transport[numberBuses + numberTrolleybuses + numberTrams];
        int i = 0;
        for (; i < numberBuses; i++) {
            transports[i] = factory.createBus();
        }
        for (; i < numberBuses + numberTrolleybuses; i++) {
            transports[i] = factory.createTrolleybus();
        }
        for (; i < numberBuses + numberTrolleybuses + numberTrams; i++) {
            transports[i] = factory.createTram();
        }
        return transports;
    }

    private static int calculateTotalCost(Transport[] transports, int N) {
        int totalCost = 0;
        for (Transport transport : transports) {
            totalCost += transport.getPurchaseCost() + transport.calculateDistanceCost(N * 1000);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int numberBuses = 10;
        int numberTrolleybuses = 7;
        int numberTrams = 5;
        int N = 200;
        int hyundaiTotalCost;
        int skodaTotalCost;
        int volvoTotalCost;

        TransportFactory hyundaiFactory = new HyundaiTransportFactory();
        TransportFactory skodaFactory = new SkodaTransportFactory();
        TransportFactory volvoFactory = new VolvoTransportFactory();

        Transport[] transports;

        transports = createTransports(skodaFactory, numberBuses, numberTrolleybuses, numberTrams);
        skodaTotalCost = calculateTotalCost(transports, N);

        transports = createTransports(volvoFactory, numberBuses, numberTrolleybuses, numberTrams);
        volvoTotalCost = calculateTotalCost(transports, N);

        System.out.println("Skoda total cost: " + skodaTotalCost + " hrn");
        System.out.println("Volvo total cost: " + volvoTotalCost + " hrn");

        if (skodaTotalCost < volvoTotalCost) {
            System.out.println("||\n\\/\nSkoda is better");
        } else if (skodaTotalCost > volvoTotalCost) {
            System.out.println("||\n\\/\nVolvo is better");
        } else {
            System.out.println("||\n\\/\nSkoda and Volvo are equal");
        }

        transports = createTransports(hyundaiFactory, numberBuses, numberTrolleybuses, numberTrams);
        hyundaiTotalCost = calculateTotalCost(transports, N);

        System.out.println("Hyundai total cost: " + hyundaiTotalCost + " hrn");

        if (hyundaiTotalCost < skodaTotalCost) {
            if (hyundaiTotalCost < volvoTotalCost) {
                System.out.println("||\n\\/\nHyundai is better");
            } else if (hyundaiTotalCost > volvoTotalCost) {
                System.out.println("||\n\\/\nVolvo is better");
            } else {
                System.out.println("||\n\\/\nHyundai and Volvo are equal");
            }
        } else if (hyundaiTotalCost > skodaTotalCost) {
            if (skodaTotalCost < volvoTotalCost) {
                System.out.println("||\n\\/\nSkoda is better");
            } else if (skodaTotalCost > volvoTotalCost) {
                System.out.println("||\n\\/\nVolvo is better");
            } else {
                System.out.println("||\n\\/\nSkoda and Volvo are equal");
            }
        } else {
            if (hyundaiTotalCost < volvoTotalCost) {
                System.out.println("||\n\\/\nHyundai and Skoda are equal");
            } else if (hyundaiTotalCost > volvoTotalCost) {
                System.out.println("||\n\\/\nVolvo is better");
            } else {
                System.out.println("||\n\\/\nHyundai, Skoda and Volvo are equal");
            }
        }
        System.out.println("/\\\n||\nWINNER !!!");
    }
}
