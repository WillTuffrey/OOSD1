package CarStockSystem;

public class Windscreen extends StockItem {
    public Windscreen(String Code, int Quantity, double Price) {
        super(Code, Quantity, Price);
    }

    @Override
    public String GetStockName() {
        return ("Windscreen");
    }

    @Override
    public String GetStockDescription() {
        return ("Car Windscreen");
    }
}
