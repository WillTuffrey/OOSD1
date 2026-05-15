package CarStockSystem;

public class Tyre extends StockItem {
    public Tyre(String Code, int Quantity, double Price) {
        super(Code, Quantity, Price);
    }

    @Override
    public String GetStockName() {
        return ("Car tyre");
    }

    @Override
    public String GetStockDescription() {
        return ("19\" Car Tyre");
    }
}
