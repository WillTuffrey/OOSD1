package CarStockSystem;

public class BrakeRotor extends StockItem {
    public BrakeRotor(String Code, int Quantity, double Price) {
        super(Code, Quantity, Price);
    }

    @Override
    public String GetStockName() {
        return ("Brake rotor");
    }

    @Override
    public String GetStockDescription() {
        return ("280mm Front Brake Rotor");
    }
}
