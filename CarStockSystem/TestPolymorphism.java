package CarStockSystem;

import java.util.Scanner;

public class TestPolymorphism {
    public static void  ConfigureStock() {
        StockItem[] stock = new StockItem[4];

        Tyre tyre = new Tyre("MPSC2", 12, 399, "Michelin", "Pilot Sport Cup 2", 20);
        Windscreen windscreen = new Windscreen("PWS134", 4, 236, "PILKINGTON", 2.07, true);
        BrakeRotor brakeRotor = new BrakeRotor("DBR12", 37, 106.99, "DRIVETEC", 265, false);
        NavSys satNav = new NavSys("NS101",10,99.99);

        stock[0] = tyre;
        stock[1] = windscreen;
        stock[2] = brakeRotor;
        stock[3] = satNav;

        for (StockItem item : stock) {
            itemInstance(item);
        }
    }
    public static void itemInstance(StockItem unit) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Current stock information:");
        System.out.println(unit.ToString());
        System.out.println();
        System.out.println("How many units do you want to sell? ");

        int remove = scanner.nextInt();
        unit.SellStock(remove);

        System.out.println("\nUnits updated.\n");
        System.out.println(unit.ToString());
        System.out.println();
        System.out.println("How many units do you want to add? ");

        int add = scanner.nextInt();
        unit.AddStock(add);

        System.out.println("\nUnits updated.\n");
        System.out.println(unit.ToString());
        System.out.println();
        System.out.println("What price would you like to set for this product? ");

        double price = scanner.nextDouble();
        unit.SetPrice(price);

        System.out.println("Price Updated.");
        System.out.println();
        System.out.println(unit.ToString());
        System.out.println();
        System.out.println("NEXT ITEM");
        System.out.println();
    }
    static void main(String[] args) {
        ConfigureStock();
    }
}