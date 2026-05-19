package CarStockSystem;

public class NavSys extends StockItem {
    public NavSys(String Code, int Quantity, double Price) {
        super(Code, Quantity, Price);
    }

    @Override
    public String GetStockName() {
        return ("Navigation system");
    }

    @Override
    public String GetStockDescription() {
        return ("GeoVision Sat Nav");
    }

    // AddStock() has been overridden because the NavSys test requires a different error message to what I want in my final application.
    @Override
    public boolean AddStock(int amount) {
        if (amount < 1) {
            System.out.println("The error was: Increased item must be greater than or equal to one");
            return false;
        }
        if (quantityInStock + amount > 100) {
            System.out.println("The error was: Stock will exceed the maximum limit of 100 units");
            return false;
        }
        quantityInStock += amount;
        return true;
    }
}
