package CarStockSystem;

public class TestNavSys {
    public static void TestNavSysStock() {
        NavSys stock = new NavSys("NS101", 10, 99.99);

        System.out.println("Task 1. Creating a stock with 10 units Navigation system, price 99.99, and item code NS101 Printing stock item information\n");
        System.out.println(stock.ToString());

        System.out.println("\n\nTask 2. Increasing 10 more units Printing stock item information\n");
        if (!stock.AddStock(10));
        else System.out.println(stock.ToString());

        System.out.println("\n\nTask 3. Sold 2 units Printing stock item information\n");
        if (!stock.SellStock(2));
        else System.out.println(stock.ToString());

        System.out.println("\n\nTask 4. Set new price 100.99 per unit Printing stock item information\n");
        stock.SetPrice(100.99);
        System.out.println(stock.ToString());

        System.out.println("\n\nTask 5. Increasing 0 more units\n");
        if (!stock.AddStock(0));
        else System.out.println(stock.ToString());
    }
    static void main(String[] args) {
        TestNavSysStock();
    }
}
